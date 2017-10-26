package soap.demo.listeners;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by namalas on 8/16/2017.
 */
public class ReportGeneratorForCukeJson {
    public static void main(String args[]) {
        System.out.println("\"Main Method called\" = " + "Main Method called");
        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("C:\\Workspace\\15Aug2017\\pulse-core\\out\\report.json");
     /*   jsonFiles.add("C:\\jsonReports\\Report_1.json");
        jsonFiles.add("C:\\jsonReports\\Report_2.json");
        jsonFiles.add("C:\\jsonReports\\Report_3.json");
        jsonFiles.add("C:\\jsonReports\\Report_4.json");
        jsonFiles.add("C:\\jsonReports\\Report_5.json");
        jsonFiles.add("C:\\jsonReports\\Report_6.json");
        jsonFiles.add("C:\\jsonReports\\Report_7.json");
        jsonFiles.add("C:\\jsonReports\\report_8.json");
        jsonFiles.add("C:\\jsonReports\\report_9.json");
        jsonFiles.add("C:\\jsonReports\\report_10.json");
        jsonFiles.add("C:\\jsonReports\\report_11.json");
        jsonFiles.add("C:\\jsonReports\\report_12.json");
        jsonFiles.add("C:\\jsonReports\\report_13.json");*/


        String buildNumber = "1";
        String projectName = "Pulse Automation";
        boolean runWithJenkins = false;
        boolean parallelTesting = false;

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
// optional configuration
        configuration.setParallelTesting(parallelTesting);
        configuration.setRunWithJenkins(runWithJenkins);
        configuration.setBuildNumber(buildNumber);
// addidtional metadata presented on main page
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();
    }
}
