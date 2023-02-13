import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class MicroserviceCustomerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("CustomerManagement Started");
        SpringApplication.run(MicroserviceCustomerApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("customer microservice");
    }
}
