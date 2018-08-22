package cn.tomxin.springboot.mapper;

import cn.tomxin.springboot.entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoMapper {
    @Select("select * from demo")
    List<Demo> findAll();

//    @Select("SELECT * FROM birthday WHERE name  like\"%\"#{name}\"%\"")
//    List<Birthday> findByName(@Param("name") String state);
//
//    @Select("SELECT * FROM birthday WHERE month_day  like\"\"#{numMonth}\"%\" or month_day  like\"\"#{cnMonth}\"%\"")
//    List<Birthday> findByMonth(@Param("numMonth") String numMonth, @Param("cnMonth") String cnMonth);
//
//    @Insert("insert into birthday(user_id, name, year, month_day) values(#{userId}, #{name}, #{year}, #{monthDay})")
//    @Options(useGeneratedKeys=true,keyProperty="id")
//    void addBirthday(Birthday birthday);
}
