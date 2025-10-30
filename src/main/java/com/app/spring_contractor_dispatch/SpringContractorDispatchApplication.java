package com.app.spring_contractor_dispatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class SpringContractorDispatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringContractorDispatchApplication.class, args);
	}

}
