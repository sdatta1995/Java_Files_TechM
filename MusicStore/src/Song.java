import java.sql.Date;
import java.util.Calendar;
public class Song {
	private String songTitle;
	private int releaseYear;
	private float price;
	private String genre;
	private String singer;
	
	Song (String songTitle, String singer, String genre, int releaseYear){
		this.songTitle = songTitle;
		this.releaseYear = releaseYear;
		this.genre= genre;
		this.singer = singer;
	}
	
	public float calculatePrice() {
	
		int difference = 0;
		float temp_price=10.00f;
		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int curr_year = cal.get(Calendar.YEAR);
		if (this.releaseYear<curr_year) {
			difference = curr_year-releaseYear;
			temp_price = temp_price - difference;
			if (temp_price>5.00f)
				return temp_price;
			else return temp_price=5.00f;
		}else 
			return temp_price = 10.00f;
	}
	

	public void setSongTitle(String songTitle) {
		this.songTitle=songTitle;
	}
	
	public void setReleaseYear(int releaseYear) {
		this.releaseYear=releaseYear;
	}
	
	public void setGenre (String genre) {
		this.genre = genre;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String getSongTitle() {
		return this.songTitle;
	}
	
	public int getReleaseYear() {
		return this.releaseYear;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public String getSinger() {
		return this.singer;
	}
	
	public String toString() {
		return "Playing "+getSongTitle()+" by "+getSinger()+" of genre "+getGenre()+" released on "+getReleaseYear();
	}
}
