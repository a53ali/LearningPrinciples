import com.company.OOP.Polymorphism.BaseClass;
import com.company.OOP.Polymorphism.DerivedClass;
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
public class PolymorphismTest {

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
    public void verifyOverriding() {

        // BaseClass reference and object
        BaseClass baseClass = new BaseClass();
        // BaseClass reference but DerivedClass object
        BaseClass derivedClass = new DerivedClass();

        // Calls the method from BaseClass class
        assertThat(baseClass.methodToOverride(), is(5.0));

        //Calls the method from DerivedClass class
        assertThat(derivedClass.methodToOverride(), is(200.0));
    }


    @Test
    public void verifyOverloading() {

        // BaseClass reference and object
        BaseClass baseClass = new BaseClass();
        double result;

        baseClass.overloadedMethod(10);
        assertThat(outContent.toString(), is("a: 10\n"));
        outContent.reset();

        baseClass.overloadedMethod(10, 20);
        assertThat(outContent.toString(), is("a and b: 10,20\n"));
        outContent.reset();

        result = baseClass.overloadedMethod(5.5);
        assertThat(result, is(30.25));
    }


}

