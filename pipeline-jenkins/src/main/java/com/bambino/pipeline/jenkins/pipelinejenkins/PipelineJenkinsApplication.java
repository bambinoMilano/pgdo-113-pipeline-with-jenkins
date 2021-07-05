package com.bambino.pipeline.jenkins.pipelinejenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({PipelineJenkinsController.class})
public class PipelineJenkinsApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PipelineJenkinsApplication.class, args);
	}
	
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		setRegisterErrorPageFilter(false);
		return application.sources(PipelineJenkinsApplication.class);
	}

}
