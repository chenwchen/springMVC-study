package mybatis.dao;

import mybatis.dao.IUserDao;
import mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class IUserDaoTest {
    private  InputStream in;
    private  SqlSession session;
    IUserDao userDao;
    @Before
    public void init(){
        try {
            in = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2、创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory =  builder.build(in);
        //3、使用工厂生产SqlSession对象
        session = factory.openSession();
        userDao = session.getMapper(IUserDao.class);
    }
    @After
    public void destroy() throws IOException {
        session.commit();
        session.close();
        in.close();
    }
    @Test
    public void testFindAll() throws IOException {
        //5、使用代理执行方法
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void testSaveUser() throws IOException {
        User user = new User();
        user.setUsername("老张");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("遵义");
        userDao.saveUser(user);
        System.out.println("保存数据成功");
    }
    @Test
    public void testUpdateUser(){
        userDao.updateUser(50,"老缪");
    }
    @Test
    public void testDeleteUser(){
        userDao.deleteUser(48);
    }

    @Test
    public void testFindOne(){
        User user = userDao.findOne(50);
        System.out.println(user);
    }


}
