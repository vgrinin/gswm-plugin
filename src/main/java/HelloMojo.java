import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "hello")
public class HelloMojo extends AbstractMojo {
    public void execute() {
        getLog().info("Hello maven plugin");
    }
}