package com.cat.demo;

import com.cat.demo.models.Match;
import com.cat.demo.models.Reason;
import com.cat.demo.models.Student;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SampleClient implements CommandLineRunner {
    private final FeignRestClient feignRestClient;

    public SampleClient(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {


        Student  student = feignRestClient.createStudent(new Student("094231","Geofrey"));
        System.out.println("Created student: "+student);

        Match match = feignRestClient.requestMatch("MALE", student.getId());
        System.out.println("Match given: "+match);

        Match reject = feignRestClient.rejectMatch(match.getId(), new Reason(student.getId(), "Poor choice given"));
        System.out.println("Rejected match :" + reject);

        Match request = feignRestClient.request(match.getId(), 20L, student.getId());
        System.out.println("Given request:"+request);





    }

}
