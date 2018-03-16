import java.util.*;
public class User {
	private String name;
	private int id;
	private ArrayList<Song> song = new ArrayList<Song>();
	
	User (String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public boolean addSong(Song songs) throws songException {
		int flag = 0;
		for (int x=0; x<song.size(); x++) {
			Song sObj = song.get(x);
			if (sObj.getSongTitle()==songs.getSongTitle() && sObj.getGenre()==songs.getGenre() && sObj.getSinger()==songs.getSinger() && sObj.getReleaseYear()==songs.getReleaseYear()) {
				flag = 1;
				break;
			}
		}
		if (flag!=1) {
			song.add(songs);
			return true;
		}else{
			throw new songException("The song already exists.");
		}
	}
	
	public Song playSong(Song songs) throws  songException{
		int flag = 0;
		for (int x=0; x<song.size(); x++) {
			Song sObj = song.get(x);
			if (sObj.getSongTitle()==songs.getSongTitle() && sObj.getGenre()==songs.getGenre() && sObj.getSinger()==songs.getSinger() && sObj.getReleaseYear()==songs.getReleaseYear()) {
				flag = 1;
				break;
			}
		}
		if (flag==1) {
			return songs;
		}else{
			throw new songException("The song do not exists.");
		}
		
	}
}
