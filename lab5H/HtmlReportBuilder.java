package lab5H;

public class HtmlReportBuilder implements IReportBuilder {
    private Report report = new Report();
    public void setHeader(String h) { report.header = "<h1>" + h + "</h1>"; }
    public void setContent(String c) { report.content = "<p>" + c + "</p>"; }
    public void setFooter(String f) { report.footer = "<footer>" + f + "</footer>"; }
    public Report getReport() { return report; }
}
