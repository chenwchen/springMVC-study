package mybatis.dao;

import mybatis.pojo.User;

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
    List<User> findAll();
}
