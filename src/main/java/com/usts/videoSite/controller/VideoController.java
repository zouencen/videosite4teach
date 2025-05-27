/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usts.videoSite.controller;

import com.usts.videoSite.controller.repo.VideoRepo;
import com.usts.videoSite.model.Video;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author SEEWO
 */
@Controller
public class VideoController {
    @Autowired
    VideoRepo videos;
    public VideoController()
    {
        //this.videos = new VideoRepo();
        
    }
    
    @GetMapping("/home")
    public String helloPage(Model model)
    {
       /*comment these if you have this in db*/
            Video v = new Video(1,"tom and jerry","tom and jerry is a cartoon",20,"/file/1.mp4","/file/1.png");
        videos.save(v);
        v = new Video(2,"Hvoc","a drug deal goes wrong",120,"/file/2.mp4","/file/2.png");
        videos.save(v);
        v = new Video(3,"G20","影片虚构的G20峰会被恐怖分子破坏，戴维斯饰演的美国总统泰勒·萨顿，必须倾尽治国之道和军事经验来保护她的家人、她的同僚领袖，当然还有整个世界。",120,"/file/3.mp4","/file/3.png");
        videos.save(v);
        v = new Video(4,"shortvideo4","a short video",1,"/file/4.mp4","/file/4.png");
        videos.save(v);
        v = new Video(5,"shortvideo5","a short video",1,"/file/5.mp4","/file/5.png");
        videos.save(v);
        v = new Video(6,"shortvideo6","a short video",1,"/file/6.mp4","/file/6.png");
        videos.save(v);
        v = new Video(7,"shortvideo7","a short video",1,"/file/7.mp4","/file/7.png");
        videos.save(v);
        v = new Video(8,"shortvideo8","a short video",1,"/file/8.mp4","/file/8.png");
        videos.save(v);

        
        
        model.addAttribute("videos",videos.findAll());
        //model.addAttribute("videos",videos.getVideos());
        return "home";
    }
    
    
    @PostMapping("/search")
    public String handleSearch(@RequestParam("search") String search,Model model) {
        List<Video> videoList = videos.findByNameLike("%"+search+"%");
        model.addAttribute("videos",videoList);
        //model.addAttribute("videos",videos.getVideos());
        return "home";
    }
    
    @GetMapping("/video/{id}")
    public String player(@PathVariable("id") int id,Model model)
    {
        //model.addAttribute("videos",videos.getVideos());
        Video video = videos.findOne((long)id);
        //Video video = videos.getVideoById(id);
        model.addAttribute("video",video);
        return "video_player";
    }
    
    
}
