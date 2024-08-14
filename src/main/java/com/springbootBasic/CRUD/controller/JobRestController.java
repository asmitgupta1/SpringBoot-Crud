package com.springbootBasic.CRUD.controller;

import com.springbootBasic.CRUD.model.JobPost;
import com.springbootBasic.CRUD.service.JobService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
public class JobRestController {

    @Autowired
    private JobService service;



//    @GetMapping("/csrf-token")
//    public CsrfToken getToken(HttpServletRequest request){
//        return (CsrfToken) request.getAttribute("_csrf");
//    }

    @GetMapping("/jobPosts")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();

    }

    @GetMapping("/jobPost/{postId}")
    public Optional<JobPost> getJob(@PathVariable int postId) {
        return service.getJob(postId);
    }

    @GetMapping("/jobPost/{keyword1}/{keyword2}")
    public List<JobPost> getJobByKeyword(@PathVariable String keyword1, @PathVariable String keyword2) {
        return service.getJobByKeyword(keyword1, keyword2);
    }

    @PostMapping("jobPost")
    public Optional<JobPost> addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public Optional<JobPost> updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId)
    {
        service.deleteJob(postId);
        return "Deleted";
    }
}
