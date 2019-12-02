package mybatis.dao;

import mybatis.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 用户持久层接口
 *
 *
 * 1、创建maven工程并导入坐标
 * 2、创建实体类的dao接口
 * 3、创建mybatis的住配置文件 SqlMapConfig.xml
 * 4、创建映射配置文件 interface_name.xml
 */
public interface IUserDao {
    /**
     * 查询所有操作
     * @return
     */

    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where id=#{id}")
    User findOne(Integer id);

    @Insert("insert into user(username,birthday,sex,address) values(#{username},#{birthday},#{sex},#{address})")
    void saveUser(User user);

    @Update("update user set username=#{username} where id=#{id}")
    void updateUser(@Param("id")Integer id, @Param("username") String username);

    @Delete("delete from user where id=#{id}")
    void deleteUser(Integer id);
}
