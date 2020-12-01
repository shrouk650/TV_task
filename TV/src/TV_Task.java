
public class TV_Task {

	public static void main(String[] args) {
		
		//create object from TV class 
		TV Home_TV = new TV();
		Home_TV.turnon();
		Home_TV.setChannel(90);
		Home_TV.setChannel(150);
		Home_TV.setVolume(10);
		Home_TV.volumeup();
		
		System.out.println("Home TV is" + " " + Home_TV.isTVon());
		System.out.println("Home TV channel is " + Home_TV.GetTVchannel());
		System.out.println("Home TV volume is " + Home_TV.GetTVvolume());
		
		
		//Object two
		TV Another_TV = new TV();
		Another_TV.turnon();
		Another_TV.setChannel(100);
		Another_TV.setChannel(10000);
		Another_TV.Channelup();
		Another_TV.setVolume(5);
		Another_TV.volumeup();
		
		System.out.println("Home TV is" + " " + Another_TV.isTVon());
		System.out.println("Home TV channel is " + Another_TV.GetTVchannel());
		System.out.println("Home TV volume is " + Another_TV.GetTVvolume());

	}

}
