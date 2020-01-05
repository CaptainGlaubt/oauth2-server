package com.lernholt.oauth2.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lernholt.oauth2.json.client_registration.ClientRegistrationRequest;
import com.lernholt.oauth2.json.client_registration.ClientRegistrationResponse;

@RestController
@RequestMapping("/client")
public class ClientRegistrationController {
	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<ClientRegistrationResponse> registerClient(
			@Valid RequestEntity<ClientRegistrationRequest> requestEntity) {
		ClientRegistrationResponse response = new ClientRegistrationResponse().withClientId("clientId")
				.withClientSecret("clientSecret");
		return ResponseEntity.ok(response);
	}
}
