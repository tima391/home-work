package lab9H;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        if (!components.contains(component)) {
            components.add(component);
        } else {
            System.out.println("Предупреждение: '" + component.getName() + "' уже в папке.");
        }
    }

    public void removeComponent(FileSystemComponent component) {
        if (components.contains(component)) {
            components.remove(component);
        } else {
            System.out.println("Ошибка: '" + component.getName() + "' не найден.");
        }
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ Папка: " + name);
        for (FileSystemComponent component : components) {
            component.display(indent + "  ");
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public String getName() {
        return name;
    }
}
