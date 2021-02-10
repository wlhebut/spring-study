import com.ta.mapper.StudentMapper;
import com.ta.mapper.TeacherMapper;
import com.ta.mapper.UserMapper;
import com.ta.pojo.Student;
import com.ta.pojo.Teacher;
import com.ta.pojo.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

   static  Logger logger =   Logger.getLogger(MyTest.class);
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        List<User> select = userMapper.select();
        System.out.println(select);

        logger.error("111error");

        User user = new User();
        user.setName("lisi6");
        userMapper.insert(user);
        List<User> select2 = userMapper.select();
        System.out.println(select2);
    }

    @Test
    public void testMap(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("userName","%"+"li"+"%");
        List<User> users = userMapper.selectByName(map);
        System.out.println(users);
    }

    @Test
    public void testInsert(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        User user = new User("xiaowu");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }


    @Test
    public void teachers(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");

        TeacherMapper mapper = context.getBean("teacherMapper", TeacherMapper.class);

        List<Teacher> teachers = mapper.selectTeachers();

        System.out.println(teachers);
    }

    @Test
    public  void students(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
        StudentMapper mapper = context.getBean("studentMapper", StudentMapper.class);

        List<Student> students = mapper.selectStudents();

        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public  void students2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
        StudentMapper mapper = context.getBean("studentMapper", StudentMapper.class);

        List<Student> students = mapper.selectStudents2();

        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void teacher1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");

        TeacherMapper teacherMapper = context.getBean("teacherMapper", TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.selectTeachers1(2);


        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

    }
    @Test
    public void teacher2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");

        TeacherMapper teacherMapper = context.getBean("teacherMapper", TeacherMapper.class);
        List<Teacher> teachers = teacherMapper.selectTeachers2(1);


        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

    }

}
