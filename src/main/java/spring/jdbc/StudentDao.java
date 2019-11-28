package spring.jdbc;

import javax.sql.DataSource;
import java.util.List;
@SuppressWarnings("all")
public interface StudentDao {

    public void setDataSource(DataSource ds);

    public void create(String name, Integer age);

    public Student getStudent(Integer id);

    public List<Student> listStudents();

    public void delete(Integer id);

    public void update(Integer id, Integer age);

}
