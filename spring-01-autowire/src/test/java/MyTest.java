import com.ta.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);


    }
}
