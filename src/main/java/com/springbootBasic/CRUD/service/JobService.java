package com.springbootBasic.CRUD.service;

import com.springbootBasic.CRUD.model.JobPost;
import com.springbootBasic.CRUD.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo repo;

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    public void addJob(JobPost jobPost) {
        repo.addJobPost(jobPost);

    }

    public JobPost getJob(int postId) {

        return repo.getJob(postId);
    }





    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);

    }





    public void deleteJob(int postId) {
        repo.deleteJob(postId);

    }
}
