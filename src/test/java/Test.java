import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zccz14 on 2017/2/24.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ABean a = (ABean) ctx.getBean("str");
        System.out.println(a.getValue());
    }
}
