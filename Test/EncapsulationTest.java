import com.company.OOP.Enscapulation.EncapsulationDemo;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by adil on 24/02/16.
 */
public class EncapsulationTest {


    @Test
    public void VerifyEnscapulatedAttributes() {
        EncapsulationDemo person = new EncapsulationDemo();
        person.setEmpName("Mario");
        person.setEmpAge(32);
        person.setEmpSSN(112233);

        assertThat(person.getEmpName(), is("Mario"));
        assertThat(person.getEmpAge(), is(32));
        assertThat(person.getEmpSSN(), is(112233));
    }
}
