package lab5H;

public class ReportDirector {
    public void construct(IReportBuilder builder) {
        builder.setHeader("Отчет по продажам");
        builder.setContent("Все супер, прибыль растет.");
        builder.setFooter("Конец отчета");
    }
}
