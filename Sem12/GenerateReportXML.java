
public class GenerateReportXML implements ReportGenerator {

    @Override
    public Report generateReport(Document document) {
        System.out.println("Generating XML Report");
        // Логика генерации XML-отчета
        return new Report("XML-отчет".getBytes());
    }
}
