package utils;

import org.junit.Assert;
import org.junit.Assume;
import java.util.HashMap;

public class Reporter {

    boolean flag = false;


    /**
     * Asserts that a condition is true. If it isn't it throws an
     * {@link AssertionError} with the given message.
     *
     * @param message   the identifying message for the {@link AssertionError} (<code>null</code>
     *                  okay)
     * @param flag condition to be checked
     */
    public void assertTrue(String message, boolean flag) {
        if(flag == false){
        }
        Assert.assertTrue(message, flag);
    }


    /**
     * Asserts that a condition is true. If it isn't it throws an
     * {@link AssertionError} without a message.
     *
     * @param flag condition to be checked
     */
    public void assertTrue(boolean flag) {
        if(flag == false){
        }
        Assert.assertTrue(flag);
    }

}
