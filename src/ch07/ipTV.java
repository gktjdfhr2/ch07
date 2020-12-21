package ch07;

public class ipTV extends Television {
	int VODChannel = 1;
	boolean VODstate = false;

	@Override
	void channelUp() {
		if (this.channel >= 15) {
			this.channel = 1;
			System.out.println(this.channel + "번 채널로 변경합니다");
		} else {
			channel++;
			System.out.println(this.channel + "번 채널로 변경합니다");
		}
	}

	@Override
	void channelDown() {
		if (this.channel <= 1) {
			this.channel = 15;
			System.out.println(this.channel + "번 채널로 변경합니다");
		} else {
			channel--;
			System.out.println(this.channel + "번 채널로 변경합니다");
		}
	}

	void VOD_On() {
		if (this.VODstate == false) {
			this.VODstate = true;
			System.out.println("VOD채널 켜기");
		} else {
			this.VODstate = false;
			System.out.println("VOD채널 끄기");
		}
	}
	void VODchangeChannel(int channel) {
		
		this.VODChannel = channel;
		System.out.println(this.VODChannel + "번 채널로 변경합니다");
	}


	void VOD_ChannelUp() {
		if (this.VODChannel == 15) {
			this.VODChannel = 1;
			System.out.println(this.VODChannel + "번 채널로 변경합니다");
		} else {
			VODChannel++;
			System.out.println(this.VODChannel + "번 채널로 변경합니다");
		}
	}

	void VOD_ChannelDown() {
		if (this.VODChannel == 1) {
			this.VODChannel = 15;
			System.out.println(this.VODChannel + "번 채널로 변경합니다");
		} else {
			VODChannel--;
			System.out.println(this.VODChannel + "번 채널로 변경합니다");
		}
	}

	@Override
	void volumeUp() {
		if (this.volume >= 25) {
			this.volume = 25;
			System.out.println("볼륨이 최대입니다.\n현재 볼륨 " + this.volume);
		} else {
			this.volume++;
			System.out.println("볼륨을 1 올립니다.\n현재 볼륨 " + this.volume);
		}
	}

	void volumeDown() {
		if (this.volume <= 0) {
			this.volume = 0;
			System.out.println("볼륨이 최소입니다.\n현재 볼륨 " + this.volume);
		} else {
			this.volume--;
			System.out.println("볼륨을 1 줄입니다.\n현재 볼륨 " + this.volume);
		}
	}
}
