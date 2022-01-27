package JAVA_Example;

public class Ex6_19 {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOff(){
        isPowerOn = !isPowerOn;
    }
    void volumeUp(){
        if (MAX_VOLUME>volume){
            volume += 1;
        }
    }
    void volumeDown(){
        if(MIN_VOLUME<volume)
            volume -= 1;
    }
    void channelUp(){
        if(channel==MAX_CHANNEL)
            channel = MIN_CHANNEL;
        else if(channel<MAX_CHANNEL)
            channel += 1;
    }
    void channelDown(){
        if(channel==MIN_CHANNEL)
            channel = MAX_CHANNEL;
        else if(channel>MIN_CHANNEL)
            channel -= 1;
    }
}
