package moayad.tapestry_hibernate.pages.address;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import moayad.tapestry_hibernate.entities.Address;
import moayad.tapestry_hibernate.pages.Index;

public class CreateAddress 
{
    @Property
    private Address address;
    
    @Inject
    private Session session;

    @InjectPage
    private Index index;

    @CommitAfter
    Object onSuccess()
    {
        session.persist(address);

        return index;
    }
}
