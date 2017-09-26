package core;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

public class SubtractTest {
    @Test(priority = 1)
    public void add_test_instanceOf(){
        assertThat(Calculator.subtract(2,2), instanceOf(Double.class));
    }

    @Test(priority = 2)
    public void add_test_2_param (){
        assertThat(Calculator.subtract(4,2), equalTo(2.0));
    }

    @Test(priority = 3)
    public void add_test_3_param(){
        assertThat(Calculator.subtract(8,2,2), equalTo(4.0));
    }

    @Test(priority = 4)
    public void add_test_4_param(){
        assertThat(Calculator.subtract(10,2,2,2), equalTo(4.0));
    }

}
