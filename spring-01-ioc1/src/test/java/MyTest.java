import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Object hello = context.getBean("hello");
        System.out.println(hello);



    }

    @Test
    public void test(){
        System.out.println(123
        );
    }
}
