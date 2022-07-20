package com.example.microservices.FacultyInformation.FeignProxy;

import java.util.Optional;

//import org.springframework.cloud.netflix.feign.FeignClient;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.microservices.FacultyInformation.Bean.Faculty;


//@FeignClient(name="Faculty-Information")
//@RibbonClient(name="Faculty-Information")
public interface FacultyGetdetailsProxy {
	
	@GetMapping(path="/fetch/id/{id}")
	public Optional<Faculty> fetchbyId(@PathVariable Long id);

}
