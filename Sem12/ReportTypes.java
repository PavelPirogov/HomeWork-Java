
import java.util.HashMap;
import java.util.Map;

public class ReportTypes {

        protected static Map<String, ReportGenerator> reportGenerators = new HashMap<>();

        static {
            reportGenerators.put("PDFCommon", new GenerateReportPDFCommon());
            reportGenerators.put("PDF", new GenerateReportPDFSubType());
            reportGenerators.put("XML", new GenerateReportXML());
            // и любые другие
        }
    }