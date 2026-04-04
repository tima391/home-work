package lab9H;

public class HomeTheaterFacade {
    private TV tv;
    private AudioSystem audio;
    private DVDPlayer dvd;
    private GameConsole console;

    public HomeTheaterFacade(TV tv, AudioSystem audio, DVDPlayer dvd, GameConsole console) {
        this.tv = tv;
        this.audio = audio;
        this.dvd = dvd;
        this.console = console;
    }

    public void watchMovie() {
        System.out.println("\n--- Режим: Просмотр фильма ---");
        tv.on();
        audio.on();
        audio.setVolume(20);
        dvd.play();
    }

    public void endMovie() {
        System.out.println("\n--- Выключение всей системы ---");
        dvd.stop();
        tv.off();
        audio.off();
    }

    public void playGame(String gameName) {
        System.out.println("\n--- Режим: Видеоигра ---");
        tv.on();
        console.on();
        console.startGame(gameName);
    }

    public void listenToMusic() {
        System.out.println("\n--- Режим: Музыка ---");
        tv.on();
        audio.on();
        audio.setVolume(15);
        System.out.println("Аудиовход установлен на TV");
    }

    public void setVolume(int level) {
        audio.setVolume(level);
    }
}
