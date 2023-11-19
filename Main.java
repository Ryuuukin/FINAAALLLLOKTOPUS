import adapter.AdapterOS;
import decorator.Comparison;
import facade.PlayerOptions;
import factory.ChooseArtist;
import observer.Begin;
import state.MusicPlayer;


public class Main {
    public static void main(String[] args) {

        //observer
        Begin star = new Begin();
        star.begin();

        //adapter
        AdapterOS bb = new AdapterOS();
        bb.AdapterOS();

        //decorator
        Comparison ss = new Comparison();
        ss.comparison();


        //factory
        ChooseArtist aa = new ChooseArtist();
        aa.chooseartist();

        //state
        MusicPlayer pp= new MusicPlayer();
        pp.MusicPlayer();

        //facade
        PlayerOptions cc = new PlayerOptions();
        cc.PlayerOptions();

    }
}
