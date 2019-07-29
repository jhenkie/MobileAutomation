package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.skeleton.Setup;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.sorting.SortingMethod;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/io/cucumber/skeleton",
        glue = "io.cucumber.skeleton",
        //tags = "@LocationTest",
        plugin = {"json:target/cucumber.json"})
public class RunCucumberTest extends Setup {

    //Generate report
    @AfterClass
    public static void writeExtentReport() {
        File reportOutputDirectory = new File("target/demo");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber.json");

        //Give project name
        String projectName = "IOVIO Project";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);

        configuration.setSortingMethod(SortingMethod.NATURAL);
        configuration.setTrendsStatsFile(new File("target/test-classes/demo-trends.json"));

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
