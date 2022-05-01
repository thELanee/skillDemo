import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {

    @Test
    public void testInitials() {
        String initials = skillDemo.getInitials("Ethan Lee");
        assertEquals(initials, "E.L.");
    }
    

}
