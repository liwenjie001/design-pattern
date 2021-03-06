package ml.lwj.facade;

public class HomeTheaterFacade {
    // 定义各个子系统的对象
    private  TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    // 构造器
    public HomeTheaterFacade() {

        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    // 操作分成四步
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        popcorn.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }
    public void play(){

        dvdPlayer.play();
    }
    public void  pause() {
        dvdPlayer.pause();
    }

    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        popcorn.off();
        stereo.off();
        dvdPlayer.off();
    }
}
