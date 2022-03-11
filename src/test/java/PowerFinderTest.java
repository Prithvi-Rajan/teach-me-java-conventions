import org.junit.jupiter.api.Test;
import powerpackage.PowerFinder;

class PowerFinderTest {
    @Test
    public void onePowerZeroIsOne() {
        assert PowerFinder.of(1,0) == 1;
    }

    @Test
    public void onePowerOneIsOne() {
        assert PowerFinder.of(1,1) == 1;
    }

    @Test
    public void twoPowerOneIsTwo() {
        assert PowerFinder.of(2,1) == 2;
    }

    @Test
    public void twoPowerTwoIsFour() {
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void threePowerTwoIsNine() {
        assert PowerFinder.of(3, 2) == 3*3;
    }
}