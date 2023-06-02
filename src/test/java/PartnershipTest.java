import com.people.Woman;
import com.people.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PartnershipTest {

    private Woman woman;
    private Man partner;

    @BeforeMethod(alwaysRun = true)
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
        SoftAssert softAssert = new SoftAssert();
        woman.registerPartnership(partner);

        woman.deregisterPartnership(true);

        softAssert.assertNull(woman.getPartner(),"Don't get divorce");
        softAssert.assertEquals(woman.getMaidenName(), woman.getLastName(),"She doesn't change last name");
    }

    @Test
    public void testDeregisterPartnership() {
        SoftAssert softAssert = new SoftAssert();
        woman.registerPartnership(partner);

        woman.deregisterPartnership(false);

        softAssert.assertNull(woman.getPartner(),"Don't get divorce");
        softAssert.assertEquals(partner.getLastName(), woman.getLastName(), "She has changed name");
    }

}

