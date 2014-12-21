
public class DrumKitTestDrive {

	public static void main(String[] args) {
		DrumKit drumkit1 = new DrumKit();
		
		drumkit1.playSnare();
		drumkit1.playTopHat();
		drumkit1.snare=false;
		if(drumkit1.snare==true){
			drumkit1.playSnare();
		}

	}

}
