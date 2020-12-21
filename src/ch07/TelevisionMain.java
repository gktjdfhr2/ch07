package ch07;

public class TelevisionMain {

	public static void main(String[] args) {
		ipTV myTV = new ipTV();
		myTV.channel = 1;
		myTV.volume = 10;
		myTV.powerOn();
		myTV.VOD_On();
		myTV.VODchangeChannel(15);
		myTV.VOD_ChannelUp();
		myTV.VOD_ChannelDown();
		myTV.VOD_ChannelDown();
		myTV.VOD_On();
		for (int i = 0; i < 11; i++) {
			myTV.volumeDown();
		}
		for (int i = 0; i < 26; i++) {
			myTV.volumeUp();
		}
	}

}
