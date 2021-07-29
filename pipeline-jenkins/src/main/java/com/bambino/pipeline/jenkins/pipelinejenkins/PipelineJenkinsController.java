package com.bambino.pipeline.jenkins.pipelinejenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class PipelineJenkinsController {
	

	@GetMapping(value = "/welcome")
	@ResponseBody
	public String welcome() {
		return "Welcome to PG DO - CI/CD Pipeline with Jenkins ";
	}
	
}
