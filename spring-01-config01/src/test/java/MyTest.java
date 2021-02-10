import com.ta.config.AppConfig;
import com.ta.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Person getPerson = context.getBean("getPerson", Person.class);
        System.out.println(getPerson);



    }
}
