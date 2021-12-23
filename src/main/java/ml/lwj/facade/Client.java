package ml.lwj.facade;

public class Client {
    public static void main(String[] args) {
        // 这里直接调用很麻烦，而且不方便
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
    }
}
