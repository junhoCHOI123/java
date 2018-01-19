package oop7;

public class LgTV implements TV{
	public void powerOn() {
		System.out.println("LgTV : 전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("LgTV : 전원을 끕니다.");
	}
	public void ChannelUp() {
		System.out.println("LgTV : 채널을 올립니다.");
	}
	public void ChannelDown() {
		System.out.println("LgTV : 채널을 내립니다.");
	}
	public void SoundUp() {
		System.out.println("LgTV : 소리를 키웁니다.");
	}
	public void SoundDown() {
		System.out.println("LgTV : 소리를 줄입니다.");
	}
}