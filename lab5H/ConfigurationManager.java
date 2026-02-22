package lab5H;

import java.util.HashMap;
import java.util.Map;
import java.io.*;

public final class ConfigurationManager {
    private static volatile ConfigurationManager instance;
    private Map<String, String> settings = new HashMap<>();
    private final String filePath = "config.txt";

    private ConfigurationManager() {
        loadFromFile();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getSetting(String key) {
        if (!settings.containsKey(key)) throw new RuntimeException("Настройка не найдена: " + key);
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public void saveToFile() {
        try (PrintWriter out = new PrintWriter(new FileWriter(filePath))) {
            settings.forEach((k, v) -> out.println(k + "=" + v));
            System.out.println("Настройки сохранены.");
        } catch (IOException e) { e.printStackTrace(); }
    }

    private void loadFromFile() {
        File file = new File(filePath);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split("=");
                    if (parts.length == 2) settings.put(parts[0], parts[1]);
                }
            } catch (IOException e) { e.printStackTrace(); }
        }
    }
}