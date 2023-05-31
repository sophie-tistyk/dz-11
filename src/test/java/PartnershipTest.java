import com.people.Woman;
import com.people.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PartnershipTest {

    private Woman woman;
    private Man partner;

    @BeforeMethod
    public void setUp() {
        woman = new Woman("Anna", "Martina", 25, "Smith");
        partner = new Man("John", "Smith", 45);
    }

    @Test
    private void testRegisterPartnership() {
        woman.registerPartnership(partner);
        Assert.assertEquals(partner, woman.getPartner(), "Don't get married");
        Assert.assertEquals(woman.getLastName(),partner.getLastName(),"She doesn't change last name");

    }

    @Test
    public void testDeregisterPartnershipWithDivorce() {
        woman.registerPartnership(partner);

        woman.deregisterPartnership(true);

        Assert.assertNull(woman.getPartner(),"Don't get divorce");
        Assert.assertEquals(woman.getMaidenName(), woman.getLastName(),"She doesn't change last name");
    }
}

