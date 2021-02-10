import com.ta.mapper.UserMapper;
import com.ta.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.transport.ObjectTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    @Test
//    @Transactional
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        List<User> select = userMapper.select();
        System.out.println(select);



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
}
