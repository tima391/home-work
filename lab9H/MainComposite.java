package lab9H;

public class MainComposite {
    public static void main(String[] args) {
        File file1 = new File("Project_Aura.fig", 2500);
        File file2 = new File("RentApp_DB.sql", 450);
        File image = new File("Background.png", 1200);

        Directory root = new Directory("C:");
        Directory projects = new Directory("Projects");
        Directory assets = new Directory("Assets");

        projects.addComponent(file1);
        projects.addComponent(file2);
        assets.addComponent(image);

        root.addComponent(projects);
        root.addComponent(assets);

        System.out.println("Иерархия файлов:");
        root.display("");

        System.out.println("\nОбщий объем диска: " + root.getSize() + " KB");

        System.out.println("\nУдаляем папку Assets...");
        root.removeComponent(assets);
        root.display("");
    }
}