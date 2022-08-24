package com.harsha.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class B2BCurdContoller {
	@GetMapping(value = "/healthCheck")
	public ResponseEntity<String> healthCheck() {
		log.info("healthCheck");
		return new ResponseEntity<String>("UP", HttpStatus.OK);
	}

}
