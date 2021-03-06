package moayad.user_form.entities;

import org.apache.tapestry5.beaneditor.Validate;

import moayad.user_form.data.Honorific;

public class Address {
	
	public Honorific honorific;
	
	@Validate("required")
    public String firstName;
	
	@Validate("required")
    public String lastName;
	
	@Validate("required")
    public String street1;
	
    public String street2;
    
    @Validate("required")
    public String city;
    
    @Validate("required")
    public String state;
    
    @Validate("required,regexp")
    public String zip;
    
    public String email;
    
    public String phone;
}
