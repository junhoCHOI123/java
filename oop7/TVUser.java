package oop7;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.ChannelUp();
		tv.ChannelUp();
		tv.SoundUp();
		tv.SoundUp();
		tv.SoundDown();
		tv.powerOff();
	}
}