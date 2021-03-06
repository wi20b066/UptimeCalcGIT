package at.morkoc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UptimeControllerTest {

    @Test
    public void test_calculateUptime_shouldBeCalcCorrect() {
        //Arrange
        UptimeController controller = new UptimeController();
        //Act
        String actualValue = controller.calculateUptime(99.95);
        //Assert - works but not a nice solution to the , . problem
        Assertions.assertEquals(String.format("%.2f", 43178.40), actualValue);
    }

}
