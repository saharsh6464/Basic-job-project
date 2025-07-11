package com.saharsh.spring_boot_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class JobPost {
    @Id
    private int id;
    private String postProfile;
    private String postDesc;

    public int getId() {
        return id;
    }

    public JobPost() {
        // default constructor needed for @ModelAttribute and Spring MVC binding
    }

    public JobPost(int id, String postProfile, String postDesc, int reqExpierence, List<String> postTechStack) {
        this.id = id;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExpierence = reqExpierence;
        this.postTechStack = postTechStack;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                "id=" + id +
                ", postProfile='" + postProfile + '\'' +
                ", postDesc='" + postDesc + '\'' +
                ", reqExpierence=" + reqExpierence +
                ", postTechStack=" + postTechStack +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public int getReqExpierence() {
        return reqExpierence;
    }

    public void setReqExpierence(int reqExpierence) {
        this.reqExpierence = reqExpierence;
    }

    public List<String> getPostTechStack() {
        return postTechStack;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    private int reqExpierence;
    private List<String> postTechStack;
}
