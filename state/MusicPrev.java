package state;

public class MusicPrev implements State {
    @Override
    public void doAction() {
        System.out.println("Previous song is playing.");
    }
}

