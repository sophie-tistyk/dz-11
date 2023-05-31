import com.people.Man;
import com.people.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetiredTest {

    private Man man = new Man("Steve", "Jobs", 70);
    private Woman woman = new Woman("Anna", "Martina", 27, "Smith");

    @Test
    public void testManIsRetired() {
        Assert.assertTrue(man.isRetired(), "This man is not retired");

    }

    @Test
    public void testWomanIsNotRetired() {
        Assert.assertFalse(woman.isRetired(), "This woman is retired");
    }

}
