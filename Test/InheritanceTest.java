import com.company.OOP.Inheritance.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by adil on 24/02/16.
 */
public class InheritanceTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void VerifyInheritedAttributes() {
        Car car = new Car();

        car.setColor("Blue");
        car.setSpeed(200);
        car.setSize(22);
        car.setCC(1000);
        car.setGears(5);

        String result = "Color of Car : Blue\n";
        result = result.concat("Speed of Car : 200\n");
        result = result.concat("Size of Car : 22\n");
        result = result.concat("CC of Car : 1000\n");
        result = result.concat("No of gears of Car : 5\n");

        car.attributescar();

        assertThat(outContent.toString(), is(result));
    }
}
