package MicroServiceServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceServerMain {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceServerMain.class, args);
    }
    
}
