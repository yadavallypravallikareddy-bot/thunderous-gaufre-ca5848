package com.jobportal;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {
    "http://127.0.0.1:5500",
    "http://localhost:5500"
})
public class JobController {

    @GetMapping("/api/jobs")
    public List<String> getJobs() {
        return Arrays.asList(
            "Java Developer - ABC Technologies - Hyderabad",
            "Web Developer - XYZ Solutions - Bengaluru",
            "Python Developer - Tech Solutions - Chennai"
        );
    }
}