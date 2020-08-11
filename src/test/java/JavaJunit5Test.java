import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaJunit5Test {

    @Test
    void failing() {
        Assertions.assertEquals(6, 17);
    }
}
