package com.ztechnics.fms.UserDashboard.Jobs;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobsController {

	@Autowired
	private JobsRepository jobsrepository;
	
	@GetMapping("/jobs")
	 public List<Jobs> getJobs() {
			return (List<Jobs>) jobsrepository.findAll();
		}
	
	/*@GetMapping
	public String main(Model model) {
		model.addAttribute("message", "Hello World");
		return "index";		
	}*/
 }
