package moayad.tapestry_hibernate.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.beaneditor.Validate;

import moayad.tapestry_hibernate.data.Honorific;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonVisual
	public Long id;

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
