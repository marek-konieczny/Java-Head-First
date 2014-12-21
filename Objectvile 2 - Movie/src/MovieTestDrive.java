
public class MovieTestDrive {

	public static void main(String[] args) {
		Movie oneMovie = new Movie();
		oneMovie.title="Gone with the Stock";
		oneMovie.genre="Drama";
		oneMovie.rating=-2;
		Movie twoMovie = new Movie();
		twoMovie.title = "Lost in Cubicle Space";
		twoMovie.genre = "Comedy";
		twoMovie.rating = 5;
		twoMovie.playIt();
		Movie threMovie = new Movie();
		threMovie.title ="Byte Club";
		threMovie.genre = "Tragic but ultimately uplifting";
		threMovie.rating = 127;
		

	}

}
