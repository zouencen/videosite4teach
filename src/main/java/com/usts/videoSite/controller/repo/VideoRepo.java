/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usts.videoSite.controller.repo;

import com.usts.videoSite.model.Video;
import java.util.List;
//import java.util.ArrayList;
//import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author SEEWO
 */

@Repository
public interface VideoRepo extends CrudRepository<Video, Long>{
    List<Video> findByNameLike(String name);

}
    /*List<Video> videos;

    
    public Video getVideoById(int id)
    {
        int id_tmp = id-1;
        Video v = videos.get(id_tmp);
        return v;
    }
    public List getVideos() {
        return videos;
    }

    public void setVideos(List Videos) {
        this.videos = Videos;
    }

    public VideoRepo(List Videos) {
        this.videos = Videos;
    }
    
    public VideoRepo()
    {
        videos = new ArrayList();
        Video v = new Video(1,"tom and jerry","tom and jerry is a cartoon",20,"/file/1.mp4","/file/1.png");
        videos.add(v);
        v = new Video(2,"Hvoc","a drug deal goes wrong",120,"/file/2.mp4","/file/2.png");
        videos.add(v);
        v = new Video(3,"G20","影片虚构的G20峰会被恐怖分子破坏，戴维斯饰演的美国总统泰勒·萨顿，必须倾尽治国之道和军事经验来保护她的家人、她的同僚领袖，当然还有整个世界。",120,"/file/3.mp4","/file/3.png");
        videos.add(v);
        v = new Video(4,"shortvideo4","a short video",1,"/file/4.mp4","/file/4.png");
        videos.add(v);
        v = new Video(5,"shortvideo5","a short video",1,"/file/5.mp4","/file/5.png");
        videos.add(v);
        v = new Video(6,"shortvideo6","a short video",1,"/file/6.mp4","/file/6.png");
        videos.add(v);
        v = new Video(7,"shortvideo7","a short video",1,"/file/7.mp4","/file/7.png");
        videos.add(v);
        v = new Video(8,"shortvideo8","a short video",1,"/file/8.mp4","/file/8.png");
        videos.add(v);
    }
    */
    
//}
