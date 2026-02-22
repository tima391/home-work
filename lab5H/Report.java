package lab5H;

public class Report {
    public String header, content, footer;
    @Override
    public String toString() {
        return "REPORT:\n" + header + "\n" + content + "\n" + footer;
    }
}