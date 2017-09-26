package core;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

public class MultiplyTest {
    @Test(priority = 1)
    public void add_test_instanceOf(){
        assertThat(Calculator.multiply(4,2), instanceOf(Double.class));
    }

    @Test(priority = 2)
    public void add_test_2_param (){
        assertThat(Calculator.multiply(2,2), equalTo(4.0));
    }

    @Test(priority = 3)
    public void add_test_3_param(){
        assertThat(Calculator.multiply(2,2,2), equalTo(8.0));
    }
    @Test(priority = 4)
    public void add_test_4_param(){
        assertThat(Calculator.multiply(2,2,2,2), equalTo(16.0));
    }

}
