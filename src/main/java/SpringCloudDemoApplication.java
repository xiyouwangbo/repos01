
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient //使用该注解将注册服务到eureka
@SpringBootApplication
public class SpringCloudDemoApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(
                SpringCloudDemoApplication.class).web(true).run(args);
    }
}