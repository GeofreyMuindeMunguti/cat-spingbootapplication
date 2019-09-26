package com.cat.demo;

import com.cat.demo.models.Match;
import com.cat.demo.models.Reason;
import com.cat.demo.models.Student;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="client", url = "http://10.51.10.111:2200/", configuration = FeignConfig.class)
public interface FeignRestClient {

    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student createStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST, value = "matches")
    Match requestMatch(@RequestParam(value = "gender") String gender, @RequestParam(value = "studentId") Long studentId);

    @RequestMapping(method = RequestMethod.PATCH, value = "matches/{id}")
    Match rejectMatch(@PathVariable(name = "id") Long id, @RequestBody Reason reason);

    @RequestMapping(method = RequestMethod.PUT, value = "dates/{id}")
    Match request(@PathVariable(name ="id")Long id, @RequestParam(value = "matchId")Long matchId, @RequestParam(value = "studentId")Long studentId);
}
