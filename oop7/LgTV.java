package oop7;

public class LgTV implements TV{
	public void powerOn() {
		System.out.println("LgTV : ������ �մϴ�.");
	}
	public void powerOff() {
		System.out.println("LgTV : ������ ���ϴ�.");
	}
	public void ChannelUp() {
		System.out.println("LgTV : ä���� �ø��ϴ�.");
	}
	public void ChannelDown() {
		System.out.println("LgTV : ä���� �����ϴ�.");
	}
	public void SoundUp() {
		System.out.println("LgTV : �Ҹ��� Ű��ϴ�.");
	}
	public void SoundDown() {
		System.out.println("LgTV : �Ҹ��� ���Դϴ�.");
	}
}