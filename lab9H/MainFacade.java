package lab9H;

public class MainFacade {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new TV(), new AudioSystem(), new DVDPlayer(), new GameConsole()
        );

        homeTheater.watchMovie();
        homeTheater.playGame("Resident Evil 4");
        homeTheater.listenToMusic();
        homeTheater.endMovie();
    }
}