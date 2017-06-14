package com.example.eclipsebz518218;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@JsonTest
public class NameTests {

	@Autowired
	private JacksonTester<Name> json;

	@Test
	public void readShouldDeseriaze() throws Exception {
		Name name = json.parseObject(Name.EXAMPLE_JSON);
		assertThat(name.toString()).isEqualTo("Fred Bricon");
	}

}
