import java.util.*;
public class MusicStores{
	static ArrayList<Song> songStore = new ArrayList<Song>();
	public static Song buySong(float price, Song songs) throws songException{
		int flag = 0;
		for (int x=0; x<songStore.size(); x++) {
			Song sObj = songStore.get(x);
			if (sObj.getSongTitle()==songs.getSongTitle() && sObj.getGenre()==songs.getGenre() && sObj.getSinger()==songs.getSinger() && sObj.getReleaseYear()==songs.getReleaseYear()) {
				flag = 1;
				break;
			}
		}
		if (flag==1) {
			return songs;
		}else{
			throw new songException("We do not have this song right now. Please put your order to the manager.");
		}
	}
	public static void main (String []args){
		try {
		Song s = new Song("Title", "Singer", "Genre", 2007);
		songStore.add(s);
		User user = new User("Name",101);
		user.addSong(buySong(10.00f, s));
		System.out.println(s.calculatePrice());
		System.out.println(user.playSong(s));
		}catch (songException se) {}
	}
}
