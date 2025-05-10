package fun.seterain3913.notruenews.backend.controller;

import fun.seterain3913.notruenews.backend.mapper.NewsMapper;
import fun.seterain3913.notruenews.backend.pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class NewsController {
    @Autowired
    NewsMapper newsMapper;
    @GetMapping("/getAllNews")
    public ArrayList<News> getAllNews(){
        return newsMapper.getAll();
    }
    @GetMapping("/getNewsById")
    public News getNewsById(int id){
        return newsMapper.getNewsById(id);
    }
    @PostMapping("/postNews")
    public void postNews(@RequestBody News news){
        newsMapper.addNews(news.getTitle(),news.getContent());
    }
}
