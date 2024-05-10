import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HoenScannerApplication extends Application<MyAppConfig> {

    @Override
    public void run(MyAppConfig configuration, Environment environment) {
        // Create an instance of your resource class
        SearchResource searchResource = new SearchResource();

        // Register the resource with Dropwizard
        environment.jersey().register(searchResource);

        // Additional setup or configuration code
    }
}