package ch07;

public class ipTV extends Television {
	int VODChannel = 1;
	boolean VODstate = false;

	@Override
	void channelUp() {
		if (this.channel >= 15) {
			this.channel = 1;
			System.out.println(this.channel + "�� ä�η� �����մϴ�");
		} else {
			channel++;
			System.out.println(this.channel + "�� ä�η� �����մϴ�");
		}
	}

	@Override
	void channelDown() {
		if (this.channel <= 1) {
			this.channel = 15;
			System.out.println(this.channel + "�� ä�η� �����մϴ�");
		} else {
			channel--;
			System.out.println(this.channel + "�� ä�η� �����մϴ�");
		}
	}

	void VOD_On() {
		if (this.VODstate == false) {
			this.VODstate = true;
			System.out.println("VODä�� �ѱ�");
		} else {
			this.VODstate = false;
			System.out.println("VODä�� ����");
		}
	}
	void VODchangeChannel(int channel) {
		
		this.VODChannel = channel;
		System.out.println(this.VODChannel + "�� ä�η� �����մϴ�");
	}


	void VOD_ChannelUp() {
		if (this.VODChannel == 15) {
			this.VODChannel = 1;
			System.out.println(this.VODChannel + "�� ä�η� �����մϴ�");
		} else {
			VODChannel++;
			System.out.println(this.VODChannel + "�� ä�η� �����մϴ�");
		}
	}

	void VOD_ChannelDown() {
		if (this.VODChannel == 1) {
			this.VODChannel = 15;
			System.out.println(this.VODChannel + "�� ä�η� �����մϴ�");
		} else {
			VODChannel--;
			System.out.println(this.VODChannel + "�� ä�η� �����մϴ�");
		}
	}

	@Override
	void volumeUp() {
		if (this.volume >= 25) {
			this.volume = 25;
			System.out.println("������ �ִ��Դϴ�.\n���� ���� " + this.volume);
		} else {
			this.volume++;
			System.out.println("������ 1 �ø��ϴ�.\n���� ���� " + this.volume);
		}
	}

	void volumeDown() {
		if (this.volume <= 0) {
			this.volume = 0;
			System.out.println("������ �ּ��Դϴ�.\n���� ���� " + this.volume);
		} else {
			this.volume--;
			System.out.println("������ 1 ���Դϴ�.\n���� ���� " + this.volume);
		}
	}
}
