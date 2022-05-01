import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {

    @Test
    public void testInitials() {
        String initials = skillDemo.getInitials("Aaron Mark Tran");
        assertEquals(initials, "A.M.T.");
    }
    

}
