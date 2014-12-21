import javax.swing.text.StyledEditorKit.ForegroundAction;

public class PhraseOMatic{
	

	public static void main(String[] args) {
	

	String[] wordListOne= {"24/7","multi-Tiar","30,OOO foot",
			"B-to-B","win-win","front-end", "web-based" ,
			"pervasive", "smart", "six-sigma","critical-path" , "dynamic"};
	
	String[] wordListTwo= {"empowered", "sticky",
			"value-added.", "oriented", "centric", 
			"distributed","clustered", "branded","outside-the-box", 
			"positioned","networked", "focused" , "leveraged", 
			"aligned","targeted", "shared", "cooperative", "accelerated"};
	
	
	String[] wordListThree= {"process", "tipping-point", "solution", 
			"architecture", "core competency","strategy", "mindshare",
			"portal" , "apace", "vision","paradigm","session"};
			
	for (int i = 0; i < 5; i++) {
	//find out how many words are in each list
	int oneLenqth= wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength =wordListThree.length;
	
	//generate random numbers
	int randl = (int) (Math.random()*oneLenqth);
	int rand2 = (int) (Math.random()* twoLength);
	int rand3 = (int) (Math.random()* threeLength);
	
	//now build a phrase 
	String phrase = wordListOne[randl] + "" +
	wordListTwo[rand2]+ " " + wordListThree[rand3];
	
	// print out phrase
	
		System.out.println("What we need is a " +phrase);	
	}
	
	
	}
}