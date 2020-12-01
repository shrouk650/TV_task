
public class TV {
	
	private int channel= 1;
	private int volume_level= 3;
	private boolean on = false;
	
	public TV(){
		
	}
	public void turnon(){
		on = true;
	}
	public void turnoff(){
		on = false;
	}
	
	public boolean isTVon(){
		return on;
	}
	
	public void setChannel(int new_channel){
		if (on && new_channel >= 1 && new_channel <=120)
		channel = new_channel;
	}
	
	public void Channelup(){
		if(on && channel <120)
		channel++;
	}
	public void Channeldown(){
		if(on && channel >1)
		channel--;
	}
	
	public void setVolume(int new_Volume){
		if (on && new_Volume >= 1 && new_Volume <=7 )
		volume_level = new_Volume;
	}
	public void volumeup(){
    	if(on && volume_level < 7)
    	volume_level ++;
    }
    public void volumedown(){
    	if(on && volume_level > 1)
    	volume_level --;
    }
	
	public int GetTVchannel(){
		return channel;
	}
	  
    public int GetTVvolume(){
		return volume_level;
	}
}
