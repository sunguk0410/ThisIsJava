package ch07.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    // Car 클래스의 stop() 메소드를 오버라이드 할 수 없음
    // final 메소드이기 때문
}