package co.pragra.ms.vechilemanagement.model;

import com.mongodb.Mongo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;

@Document
public class Vehicle {

    @Id
    public String id;

    private String vechileName;

    public Vehicle() {
    }

    public Vehicle(String vechileName) {
        this.vechileName = vechileName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVechileName() {
        return vechileName;
    }

    public void setVechileName(String vechileName) {
        this.vechileName = vechileName;
    }
}
