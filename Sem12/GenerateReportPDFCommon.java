
public class GenerateReportPDFCommon implements ReportGenerator {

        @Override
        public Report generateReport(Document document) {
            System.out.println("Generating PDF Common Report");
            // Логика генерации PDF-отчета
            return new Report("PDF Common-отчет".getBytes());
        }
        
    }