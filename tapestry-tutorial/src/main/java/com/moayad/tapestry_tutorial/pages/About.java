package com.moayad.tapestry_tutorial.pages;

import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

public class About
{
	@Property
	@Persist
	private String name;
	
	void setup(String name)
	{
		this.name = name;
	}
	
	void onActionFromChangeName(String name)
	{
		this.name = name;
	}
}
