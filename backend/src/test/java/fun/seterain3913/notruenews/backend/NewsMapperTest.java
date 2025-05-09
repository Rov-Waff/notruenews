package fun.seterain3913.notruenews.backend;

import fun.seterain3913.notruenews.backend.mapper.NewsMapper;
import fun.seterain3913.notruenews.backend.pojo.News;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NewsMapperTest {
    private static final Logger log = LoggerFactory.getLogger(NewsMapperTest.class);
    @Autowired
    NewsMapper newsMapper;
    @Test
    public void addNewsTest(){
        newsMapper.addNews("aaaaaaaaaa","ffffffffffffff");
        log.info(newsMapper.getAll().toString());
    }
    @Test
    public void getNewsByIdTest(){
        log.info(newsMapper.getNewsById(1).toString());
    }
    @Test
    public void getAllNews(){
        log.info(newsMapper.getAll().toString());
    }
}
