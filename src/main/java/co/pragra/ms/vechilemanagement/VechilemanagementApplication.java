package co.pragra.ms.vechilemanagement;

import co.pragra.ms.vechilemanagement.model.Vehicle;
import co.pragra.ms.vechilemanagement.repo.VechileRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class VechilemanagementApplication {

	private VechileRepo vechileRepo;

	public VechilemanagementApplication(VechileRepo vechileRepo) {
		this.vechileRepo = vechileRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(VechilemanagementApplication.class, args);
	}

	@Bean
	ApplicationRunner runner(){
		return args -> {
			vechileRepo.save(new Vehicle("Audi"));
			vechileRepo.save(new Vehicle("BMW"));
			vechileRepo.save(new Vehicle("Hyudai"));
			vechileRepo.save(new Vehicle("Honda"));
		};
	}

	@GetMapping("/vehicles")
	public List<Vehicle> getAll(){
	    return vechileRepo.findAll();
    }
}
