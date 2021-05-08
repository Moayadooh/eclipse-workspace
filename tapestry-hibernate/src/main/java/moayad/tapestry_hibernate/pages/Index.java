package moayad.tapestry_hibernate.pages;

import java.util.List;

import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import moayad.tapestry_hibernate.entities.Address;

public class Index
{
	@Inject
    private Session session;
    public List<Address> getAddresses()
    {
        return session.createCriteria(Address.class).list();
    }
}
