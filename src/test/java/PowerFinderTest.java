import org.junit.jupiter.api.Test;
import powerpackage.PowerFinder;

class PowerFinderTest {
    @Test
    public void one_raised_to_one_is_one_is_1() {
        assert PowerFinder.of(1,1) == 1;
    }

    @Test
    public void two_raised_to_one_is_2() {
        assert PowerFinder.of(2,1) == 2;
    }

    @Test
    public void two_raised_to_two_is_4() {
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void three_raised_to_two_is_9() {
        assert PowerFinder.of(3, 2) == 3*3;
    }
}