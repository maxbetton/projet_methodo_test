import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Test {

    private SwimmingPool swimmingPool = new SwimmingPool(30, new float[]{25, 9, 30, 15, 33, 23, 34});
    private SwimmingPool swimmingPool2 = new SwimmingPool(3, new float[]{25, 9, 30, 15, 33, 23, 34});
    private SwimmingPool swimmingPool3 = new SwimmingPool(30, new float[]{0, 9, 4, 15, 5, 23, 6});

    @org.junit.jupiter.api.Test
    public void triggerTrue() {
        Assertions.assertEquals("ON", swimmingPool.trigger());
    }

    @org.junit.jupiter.api.Test
    public void triggerFalse1() {
        Assertions.assertEquals("OFF", swimmingPool2.trigger());
    }

    @org.junit.jupiter.api.Test
    public void triggerFalse2() {
        Assertions.assertEquals("OFF", swimmingPool3.trigger());
    }
}
