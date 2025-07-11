package com.saharsh.spring_boot_rest.service;


import com.saharsh.spring_boot_rest.model.JobPost;
import com.saharsh.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost job){
        repo.save(job);
    }


    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getpostid(int postid) {
         Optional <JobPost> p =   repo.findById(postid);
         return (p.orElse(new JobPost()));
    }

    public void updatePost(JobPost job) {
        repo.save(job);
    }

    public void deletemap(int id) {
        repo.deleteById(id);
    }

    public void load() {
                List<JobPost> list = new ArrayList<>() {{
            add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
                    Arrays.asList("Core Java", "J2EE", "Spring Boot", "Hibernate")));

            add(new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
                    Arrays.asList("HTML", "CSS", "JavaScript", "React")));

            add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
                    Arrays.asList("Python", "Machine Learning", "Data Analysis")));

            add(new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
                    Arrays.asList("Networking", "Cisco", "Routing", "Switching")));

            add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
                    Arrays.asList("iOS Development", "Android Development", "Mobile App")));}};
                repo.saveAll(list);
    }
}
//
//
//public List<JobPost> list = new ArrayList<>() {{
//    add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//            Arrays.asList("Core Java", "J2EE", "Spring Boot", "Hibernate")));
//
//    add(new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
//            Arrays.asList("HTML", "CSS", "JavaScript", "React")));
//
//    add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//            Arrays.asList("Python", "Machine Learning", "Data Analysis")));
//
//    add(new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
//            Arrays.asList("Networking", "Cisco", "Routing", "Switching")));
//
//    add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
//            Arrays.asList("iOS Development", "Android Development", "Mobile App")));
//}};
//
//public List<JobPost> getAllJobs(){
//    return list;
//}
//
//public void addJob(JobPost job){
//    list.add(job);
//    System.out.println(list);
//    return;
//}
//
//public JobPost getpostid(int postid) {
//    for(JobPost job : list){
//        if(job.getId() == postid) return job;
//    }
//    return null;
//}
//
//public void updatePost(JobPost job) {
//    for(JobPost job1 : list){
//        if(job1.getId() == job.getId()){
//            job1.setPostProfile(job.getPostProfile());
//            job1.setPostDesc(job.getPostDesc());
//            job1.setPostTechStack(job.getPostTechStack());
//            job1.setReqExpierence(job.getReqExpierence());
//            return;
//        }
//    }
//}
//
//public void deleletemap(int id) {
//    for(JobPost job : list){
//        if(job.getId()==id){
//            list.remove(job);
//        }
//    }
//}
