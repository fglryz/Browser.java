package week11;

public class TV {
    // data fields + attributes
    public int channel = 1; // Default channel is 1
    public int volumeLevel = 1; // default volume will be 1
    public boolean on = false; // TV is off


    public TV(){
        //  Constructor with NO parameters
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    // why  are we initializing these values without constructor by one by and don"t we use constructor?


    public TV(int channel, int volumeLevel, boolean on) { // three parameter constructor
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public String toString() {
        return "TV" +
                "\nchannel=" + channel +
                "\n, volumeLevel=" + volumeLevel +
                "\n, on=" + on
                ;
    }



}
