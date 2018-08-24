package com.amdocs.appController;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.models.Todo;

@RestController
@RequestMapping("/home")
public class AppController {

	@RequestMapping(value = "/todo", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Todo> prepareTodoObject(@RequestBody @Valid Todo todo ) {
		
		return new ResponseEntity<Todo>(todo, HttpStatus.ACCEPTED);
	}
}
