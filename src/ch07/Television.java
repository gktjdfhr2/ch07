package ch07;

public class Television {
	int channel;
	int volume;

	void powerOn() {
		System.out.println("������ �մϴ�");
	}

	void powerOff() {
		System.out.println("������ ���ϴ�");
	}

	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println(this.channel + "�� ä�η� �����մϴ�");
	}

	void channelUp() {
		channel++;
		System.out.println(this.channel + "�� ä�η� �����մϴ�.");
	}

	void channelDown() {
		channel--;
		System.out.println(this.channel + "�� ä�η� �����մϴ�.");
	}

	void volumeUp() {
		volume++;
		System.out.println("������ 1 �ø��ϴ�.\n���� ���� " + this.volume);
	}

	void volumeDown() {
		volume--;
		System.out.println("������ 1 ���Դϴ�.\n���� ���� " + this.volume);
	}
}
