package fun.seterain3913.notruenews.backend.mapper;

import fun.seterain3913.notruenews.backend.pojo.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.ArrayList;

@Mapper
public interface NewsMapper {
    @Select("SELECT * FROM news")
    public ArrayList<News> getAll();
    @Select("SELECT * FROM news WHERE id=#{id}")
    public News getNewsById(Integer id);

    @Insert("INSERT INTO news VALUES(default,#{title},#{content})")
    public void addNews(String title,String content);

}
