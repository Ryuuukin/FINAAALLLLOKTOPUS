package state;

public class MusicNext implements State {
    @Override
    public void doAction() {
        System.out.println("Next song is playing.");
    }
}
