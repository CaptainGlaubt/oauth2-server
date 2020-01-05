package com.lernholt.oauth2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lernholt.oauth2.auth.ResponseType;

@RestController
@RequestMapping("/authorize")
public class AuthorizationController {
	@GetMapping
	public ResponseEntity<Void> authorize(
			@RequestParam(name = "response_type", required = true) ResponseType responseType,
			@RequestParam(name = "client_id", required = true) String clientId,
			@RequestParam(name = "redirect_uri") String redirectUri, @RequestParam(name = "scope") String scope,
			@RequestParam(name = "state") String state) {
		return null;
	}
}
