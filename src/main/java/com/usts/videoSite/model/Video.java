/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usts.videoSite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author SEEWO
 */
@Entity
public class Video {

    public Video()
    {}
    public Video(int id, String name, String description, long time, String resourceLink, String picLink) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.resourceLink = resourceLink;
        this.picLink = picLink;
        //this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getResourceLink() {
        return resourceLink;
    }

    public void setResourceLink(String resourceLink) {
        this.resourceLink = resourceLink;
    }

    public String getPicLink() {
        return picLink;
    }

    public void setPicLink(String picLink) {
        this.picLink = picLink;
    }
    String name;
    String description;
    long time;// miniutes
    String resourceLink;
    String picLink;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)      
    long id;

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
