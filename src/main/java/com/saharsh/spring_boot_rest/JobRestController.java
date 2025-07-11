package com.saharsh.spring_boot_rest;

import com.saharsh.spring_boot_rest.model.JobPost;
import com.saharsh.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin (origins = "http://localhost:3000/")
public class JobRestController {
    @Autowired
    private JobService service;


    @GetMapping("jobPosts")
    public List<JobPost> getAllposts() {
        return service.getAllJobs();
    }

    @GetMapping("/jobPosts/{postid}")
    public JobPost getpostid(@PathVariable("postid") int postid){
        return service.getpostid(postid);
    }

    @PostMapping("addPost")
    public void addPost(@RequestBody JobPost job){
        service.addJob(job);
    }

    @PutMapping("addPost")
    public JobPost updatePost(@RequestBody JobPost job) {
        service.updatePost(job);
        return service.getpostid(job.getId());
    }

    @DeleteMapping("delete/{id}")
    public String deletemap(@PathVariable("id") int id){
        service.deletemap(id);
        return "succuess";
    }

    @GetMapping("load")
    public void load(){
        service.load();
    }


}
