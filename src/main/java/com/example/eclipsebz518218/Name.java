package com.example.eclipsebz518218;

public class Name {

	public static final String EXAMPLE_JSON = "{\"first\":\"Fred\", \"last\":\"Bricon\"}";

	private final String first;

	private final String last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	@Override
	public String toString() {
		return this.first + " " +  this.last;
	}

}
