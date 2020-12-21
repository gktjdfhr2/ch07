package ch07;

public class Television {
	int channel;
	int volume;

	void powerOn() {
		System.out.println("전원을 켭니다");
	}

	void powerOff() {
		System.out.println("전원을 끕니다");
	}

	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println(this.channel + "번 채널로 변경합니다");
	}

	void channelUp() {
		channel++;
		System.out.println(this.channel + "번 채널로 변경합니다.");
	}

	void channelDown() {
		channel--;
		System.out.println(this.channel + "번 채널로 변경합니다.");
	}

	void volumeUp() {
		volume++;
		System.out.println("볼륨을 1 올립니다.\n현재 볼륨 " + this.volume);
	}

	void volumeDown() {
		volume--;
		System.out.println("볼륨을 1 줄입니다.\n현재 볼륨 " + this.volume);
	}
}
