package oop7;

public class SamsungTV implements TV {
	private Speaker speaker = new HarmanSpeaker(); 					// up-casting
	private Speaker Mspeaker = new MarshallSpeaker();

	public void powerOn() {
		System.out.println("SamsungTV : ������ �մϴ�.");
	}

	public void powerOff() {
		System.out.println("SamsungTV : ������ ���ϴ�.");
	}

	public void ChannelUp() {
		System.out.println("SamsungTV : ä���� �ø��ϴ�.");
	}

	public void ChannelDown() {
		System.out.println("SamsungTV : ä���� �����ϴ�.");
	}

	public void SoundUp() {
		if (speaker == null) {
			System.out.println("SamsungTV : �Ҹ��� Ű��ϴ�.");
		} else {
			Mspeaker.SoundUp();
		}
	}

	public void SoundDown() {
		if (speaker == null) {
			System.out.println("SamsungTV : �Ҹ��� ���Դϴ�.");
		} else {
			Mspeaker.SoundDown();
		}
	}
}