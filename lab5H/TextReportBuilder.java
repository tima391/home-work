package lab5H;

public class TextReportBuilder implements IReportBuilder {
    private Report report = new Report();
    public void setHeader(String h) { report.header = "TITLE: " + h; }
    public void setContent(String c) { report.content = "BODY: " + c; }
    public void setFooter(String f) { report.footer = "FOOTER: " + f; }
    public Report getReport() { return report; }
}