import com.people.Person;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonTests {
    private Person person;

    @BeforeMethod
    public void setPerson() {
        person = new Person("Sophie", "Tistyk", 27) {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
    }

    @Test
    public void testGetFirstName() {
        String firstName = person.getFirstName();
        Assert.assertEquals(firstName, "Sophie", "Wrong first name");
    }

    @Test
    public void testSetFirstName() {
        person.setFirstName("Anna");
        String firstName = person.getFirstName();
        Assert.assertEquals("Anna", firstName, "Wrong first name");
    }

    @Test
    public void testGetLastName() {
        String lastName = person.getLastName();
        Assert.assertEquals(lastName, "Martina", "Wrong last name");
    }

    @Test
    public void testSetLastName() {
        person.setLastName("Martina");
        String lastName = person.getLastName();
        Assert.assertEquals("Martina", lastName, "Wrong last name");
    }

    @Test
    public void testGetAge() {
        int age = person.getAge();
        Assert.assertEquals(age, 27, "Wrong age");
    }

    @Test
    public void testSetAge() {
        person.setAge(27);
        int age = person.getAge();
        Assert.assertEquals(27, age, "Wrong age");
    }
}
