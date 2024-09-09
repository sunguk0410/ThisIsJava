package ch08.sec05;

public class Television implements RemoteControl{

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume> ch08.sec04.RemoteControl.MAX_VOLUME) {
            this.volume = ch08.sec04.RemoteControl.MAX_VOLUME;
        } else if(volume< ch08.sec04.RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
