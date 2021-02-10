import com.ta.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.delete();


    }
}
