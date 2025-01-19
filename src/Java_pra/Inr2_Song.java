package Java_pra;

public class Inr2_Song extends Inr2_Media implements Inr2_Playable{
	
	
	
	String title;
	String artist;
	double duration;
	
	Inr2_Song (String title, String artist, double duration){
		this.title= title;
		this.artist = artist;
		this.duration= duration;
	}
	
	@Override
	public void play() {
		
		System.out.println("Playing song ");
	}

	@Override
	void getTitle() {
		
		System.out.println("Song Title : "+title);
	}
	
	void getartist(){
		System.out.println("Artist of Song  : "+artist);
	}
	void getduration() {
		System.out.println("Song Duration : "+ duration);
	}

	public static void main(String[] args) {
		Inr2_Song s1= new Inr2_Song("Jai hoo", "ARR", 6.42);
		
		s1.play();
		s1.getTitle();
		s1.getartist();
		s1.getduration();	
	}

}


		
