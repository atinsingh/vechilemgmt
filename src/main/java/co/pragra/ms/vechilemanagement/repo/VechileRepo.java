package co.pragra.ms.vechilemanagement.repo;

import co.pragra.ms.vechilemanagement.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VechileRepo extends MongoRepository<Vehicle,String> {
}
