package com.moayad.tapestry_tutorial.pages;

import org.apache.tapestry5.annotations.*;

public class Index
{
	@InjectPage
	private About about;
	
	@Log
	Object onActionFromAbout() 
	{
		about.setup("Moayad");
		return about;
	}
}
