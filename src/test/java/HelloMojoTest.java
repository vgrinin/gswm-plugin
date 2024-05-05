import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloMojoTest {
    @Test
    public void test1(){
        Assert.assertFalse(false);
    }

    ByteArrayOutputStream stream = new ByteArrayOutputStream();

    @Before
    public void setUp(){
        System.setOut(new PrintStream(stream));
    }

    @After
    public void cleanUp(){
        System.setOut(null);
    }

    @Test
    public void test2() throws MojoExecutionException, MojoFailureException {
        HelloMojo helloMojo = new HelloMojo();
        helloMojo.execute();
        Assert.assertEquals("[info] Hello maven plugin\r\n", stream.toString());
    }
}
