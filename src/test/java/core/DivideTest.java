package core;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class DivideTest {
    @Test(priority = 1)
    public void add_test_instanceOf(){
        assertThat(Calculator.divide(4,2), instanceOf(Double.class));
    }

    @Test(priority = 2)
    public void add_test_2_param (){
        assertThat(Calculator.divide(5.1,2), closeTo(2.5,0.09));
    }

    @Test(priority = 3)
    public void add_test_3_param(){
        assertThat(Calculator.divide(10, 3, 2), closeTo(1.6, 0.09));
    }
    @Test(priority = 4)
    public void add_test_4_param(){
        assertThat(Calculator.divide(22, 4, 3, 2), closeTo(0.9, 0.09));
    }


}
