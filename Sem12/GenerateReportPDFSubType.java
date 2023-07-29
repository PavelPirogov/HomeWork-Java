
public class GenerateReportPDFSubType extends GenerateReportPDFCommon {
        @Override
        public Report generateReport(Document document) {
            System.out.println("Generating PDF report subtype");
            // Логика генерации PDF-отчета с другой разметкой
            return new Report("PDF-subtype - отчет".getBytes());
        }
    }
