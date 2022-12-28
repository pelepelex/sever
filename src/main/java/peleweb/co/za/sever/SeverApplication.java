package peleweb.co.za.sever;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import peleweb.co.za.sever.enumeration.Status;
import peleweb.co.za.sever.model.Server;
import peleweb.co.za.sever.repo.ServerRepo;

import static peleweb.co.za.sever.enumeration.Status.*;

@SpringBootApplication
public class SeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeverApplication.class, args);
	}
	@Bean
	CommandLineRunner run (ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.160" , "Wondow 95","16 Gb", " Laptop"
					,"http://localhost:8080/server/image/server1.png", SERVER_UP ));
			serverRepo.save(new Server(null, "192.168.1.10" , "Wondow 10","8 Gb", " personal PC "
					,"http://localhost:8080/server/image/server2.png", SERVER_DOWN ));
			serverRepo.save(new Server(null, "192.168.1.60" , "Wondow 11","128 Gb", " dell tower"
					,"http://localhost:8080/server/image/server3.png", SERVER_DOWN ));
			serverRepo.save(new Server(null, "192.168.1.16" , "Wondow 8","64 Gb", " mtn server"
					,"http://localhost:8080/server/image/server4.png", SERVER_UP ));
			serverRepo.save(new Server(null, "192.168.1.48" , "Wondow 7","32 Gb", " uwc server"
					,"http://localhost:8080/server/image/server1.png", SERVER_DOWN ));
			serverRepo.save(new Server(null, "192.168.1.52" , "Wondow 8.1","4 Gb", " mail server"
					,"http://localhost:8080/server/image/server3.png", SERVER_UP ));
		};
	}

}
