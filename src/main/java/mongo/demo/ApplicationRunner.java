package mongo.demo;

import mongo.domain.FlightInformation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements CommandLineRunner {
    private MongoTemplate mongoTemplate;

    public ApplicationRunner(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) throws Exception{
        FlightInformation emptyFlight = new FlightInformation();
        this.mongoTemplate.save(emptyFlight);

        System.out.println("Application started");
    }
}
