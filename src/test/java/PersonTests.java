import com.people.Person;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonTests {
    private Person person;

    @BeforeMethod(alwaysRun = true)
    public void setPerson() {
        person = new Person("Anna", "Martina", 27) {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
    }

    @Test(groups = {"GetterSetter"})
    public void testGetFirstName() {
        String firstName = person.getFirstName();
        Assert.assertEquals(firstName, "Anna", "Wrong first name");
    }

    @Test(groups = {"GetterSetter"})
    public void testSetFirstName() {
        person.setFirstName("Anna");
        String firstName = person.getFirstName();
        Assert.assertEquals(firstName,"Anna",  "Wrong first name");
    }

    @Test(groups = {"GetterSetter"})
    public void testGetLastName() {
        String lastName = person.getLastName();
        Assert.assertEquals(lastName, "Martina", "Wrong last name");
    }

    @Test(groups = {"GetterSetter"})
    public void testSetLastName() {
        person.setLastName("Martina");
        String lastName = person.getLastName();
        Assert.assertEquals( lastName, "Martina","Wrong last name");
    }

    @Test(groups = {"GetterSetter"})
    public void testGetAge() {
        int age = person.getAge();
        Assert.assertEquals(age, 27, "Wrong age");
    }

    @Test(groups = {"GetterSetter"})
    public void testSetAge() {
        person.setAge(27);
        int age = person.getAge();
        Assert.assertEquals( age, 27,"Wrong age");
    }
}
