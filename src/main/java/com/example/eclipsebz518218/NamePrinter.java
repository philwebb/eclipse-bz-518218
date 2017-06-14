package com.example.eclipsebz518218;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class NamePrinter {

	private final Name name;

	public NamePrinter(ObjectMapper mapper) throws JsonParseException, JsonMappingException, IOException {
		this.name = mapper.readValue(Name.EXAMPLE_JSON.getBytes(), Name.class);
	}

	@PostConstruct
	public void print() {
		System.out.println(this.name);
	}

}
