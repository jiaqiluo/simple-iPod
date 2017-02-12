//Jiaqi Luo, CS202, hw4&5, Song.java, 8/11/2014
//This file contains the declaration of the class Song


public class Song {
	protected String title;
	protected String artist;

	//constructor
	public Song(){
		this(null, null);
	}
	
	
	//copy constructor
	public Song(final String title_source, final String artist_source) {
		if(title_source != null)
			title = title_source;
		else
			title = null;
		if(artist_source != null)
			artist = artist_source;
		else
			artist = null;
	}
	
	
	//copy constructor
	public Song(final Song source){
		this.title = new String(source.title);
		this.artist = new String(source.artist);
	}
	
	
	//this function modifies the title of the current Song
	//input:
	//     title_source -- string for new title
	public void modify_title(final String title_source) {
		if(title_source != null)
			title = title_source;
		return;
	}
	
	
	//this function modifies the artist of the current Song
		//input:
		//     artist_source -- string for new artist
	public void modify_artist(final String artist_source) {
		if(artist_source != null)
			artist = artist_source;
		return;
	}
	
	
	//this function displays the Song
	public void display(){
		System.out.println("title: " + title + "   artist: " + artist);	
		return;
	}
	
	
	//this function compares the artist in the current Song and argument
	//input:
	//     source -- string for comparing
	//output:
	//     0 -- the artists are the same
	//     other value -- they are different
	public int compare_artist(final String source) {
		return this.artist.compareTo(source);
	}
	
	
	//this function compares the title in the current Song and argument
	//input:
	//     source -- string for comparing
	//output:
	//     0 -- the titles are the same
	//     other value -- they are different
	public int compare_title(final String source) {
		return this.title.compareTo(source);
	}
}