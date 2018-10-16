package Item;

public class MoviePlayer extends Product implements MultiMediaControl {

    Screen screen;
    MonitorType monitorType;

    public MoviePlayer(String name) {
        super(name);
        this.screen = screen;
        monitorType = MonitorType.LCD;
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() { System.out.println("Stop"); }

    @Override
    public void previous() {
        System.out.println("Previous");
    }

    @Override
    public void next() {
        System.out.println("Forward");
    }

    @Override
    public String toString() {
        return  "Screen: " + screen + "\n"+
                "Monitor Type: " + monitorType;
    }
}
