package com.springbootBasic.CRUD.service;

import com.springbootBasic.CRUD.model.JobPost;
import com.springbootBasic.CRUD.repo.JobRepo;
import com.springbootBasic.CRUD.repo.JobsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    public JobsRepo jobsRepo;
    @Autowired
    public JobRepo repo;

    public List<JobPost> getAllJobs() {

        return jobsRepo.findAll();
    }
//    public List<JobPost> getAllJobs() {
//
//        return repo.getAllJobs();
//    }

    public void addJob(JobPost jobPost) {
        jobsRepo.save(jobPost);

    }

//    public void addJob(JobPost jobPost) {
//        repo.addJobPost(jobPost);
//
//    }

//    public JobPost getJob(int postId) {
//
//        return repo.getJob(postId);
//    }
    public Optional<JobPost> getJob(int postId) {

        return jobsRepo.findById(postId);
    }

    public List<JobPost> getJobByKeyword(String keyword1, String keyword2) {
        return jobsRepo.findByPostProfileContainingOrPostDescContaining(keyword1, keyword2);
    }

//    public void updateJob(JobPost jobPost) {
//        repo.updateJob(jobPost);
//    }
        public void updateJob(JobPost jobPost) {
            jobsRepo.save(jobPost);
        }

//    public void deleteJob(int postId) {
//        repo.deleteJob(postId);
//
//    }

    public void deleteJob(int postId) {
        jobsRepo.deleteById(postId);

    }
}
