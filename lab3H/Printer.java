package lab3H;

public interface Printer {
    void print(String content);
}

interface Scanner {
    void scan(String content);
}

interface Fax {
    void fax(String content);
}

class AllInOnePrinter implements Printer, Scanner, Fax {
    public void print(String content) { System.out.println("Printing: " + content); }
    public void scan(String content) { System.out.println("Scanning: " + content); }
    public void fax(String content) { System.out.println("Faxing: " + content); }
}

class BasicPrinter implements Printer {
    public void print(String content) { System.out.println("Printing: " + content); }
}