//Jiaqi Luo, CS202, hw4&5, Management.java, 8/11/2014
//This file contains the declaration of the class Management

import java.util.Scanner;


public class Management {
	protected Tree database;
	protected Playlist favourite;
	protected Scanner input;
	
	//constructor
	//create the tree and playlist for testing 
	public Management()
	{
		favourite = new Playlist();
		favourite.insert(new Lnode("Nothin' On You", "B.o.B."));
		favourite.insert(new Lnode("Rude Boy", "Rihanna"));
		favourite.insert(new Lnode("One Time", "Justin Bieber"));
		database = new Tree();
		database.insert("Telephone", "Lady Gaga");
		database.insert("Firework", "Katy Perry");
		database.insert("Rude Boy", "Rihanna");
		database.insert("What's My Name?", "Rihanna");
		database.insert("Love the Way You Lie", "Eminem");
		database.insert("Tik Tok", "Ke$ha");
		database.insert("Back to December", "Taylor Swift");
		database.insert("Omg", "Usher");
		database.insert("Runaway", "Kanye West");
		database.insert("Teenage Dream", "Katy Perry");
		database.insert("Not Afraid", "Eminem");
		database.insert("Alejandro", "Lady Gaga");
		database.insert("We R Who We R", "Ke$ha");
		database.insert("Good for Great", "Matt & Kim");
		database.insert("Empire State of Mind", "Jay-Z");
		database.insert("Eenie Meenie", "Justin Bieber");
		database.insert("Put You In a Song", "Keith Urban");
		database.insert("Blah Blah Blah", "Ke$ha");
		database.insert("Nothin' On You", "B.o.B.");
		database.insert("Hey, Soul Sister", "Train");
		database.insert("Baby", "Justin Bieber");
		database.insert("Tighten Up", "The Black Keys");
		database.insert("Over", "Drake");
		database.insert("Can't Be Tamed", "Miley Cyrus");
		database.insert("Halo", "Beyoncé");
		database.insert("Lil Freak", "Usher");
		database.insert("Born This Way", "Lady Gaga");
		database.insert("All of the Lights", "Kanye West");
		database.insert("Rock That Body", "Black Eyed Peas");
		database.insert("Replay", "Iyaz");
		database.insert("Poker Face", "Lady Gaga");
		database.insert("Vanilla Twilight", "Owl City");
		database.insert("I Gotta Feeling", "Black Eyed Peas");
		database.insert("Bad Romance", "Lady Gaga");
		database.insert("Life After You", "Daughtry");
		database.insert("Heartbreak Warfare", "John Mayer");
		database.insert("Imma Be", "Black Eyed Peas");
		database.insert("One Time", "Justin Bieber");
		database.insert("Tightrope", "Janelle Monae");
		database.insert("Just Dance", "Lady Gaga");
	}
	
	
	//this function add a song to the playlist, 
	//it allows the user input the title and artist of a song
	//if the song is not in the current library, it will ask for add the 
	//song to the library
	public void add_a_song_to_list(){
		System.out.println("Enter the title: ");
	    input = new Scanner(System.in);
	    String title = new String();
	    title = input.nextLine();
	    System.out.println("Enter the artist: ");
	    String artist = new String();
	    artist = input.nextLine();
	    Lnode temp = database.retrieve(title, artist);
	    if(temp != null)
	    	favourite.insert(temp);
	    else{
	    	System.out.println("The song doesn't in the database, do you want to add it to the database and playlist(Y/N): ");
		    String choice = new String();
		    choice = input.nextLine();
		    if("Y".equals(choice) ||"y".equals(choice)){
		    	database.insert(title, artist);
		    	Lnode new_song = new Lnode(title, artist);
		    	favourite.insert(new_song);
		    }
	    }
	}
	
	
	//this function displays all information in the tree
	public void display_tree() {
		System.out.println("++++++++++The Song Library++++++++++");	
		database.display();
	}
	
	
	//this function displays all information in the playlist
	public void display_list() {
		System.out.println("\n++++++++++The Playlist++++++++++");
		favourite.display();
	}


	//this function removes a song from the playlist
	//it checks whether the list is empty,
	//if not, it will traverses the list to remove 
	public void remove_a_song() {
		if(favourite == null){
			System.out.println("The list is empty");
			return;
		}
		System.out.println("Enter the title: ");
	    input = new Scanner(System.in);
	    String title = new String();
	    title = input.nextLine();
	    System.out.println("Enter the artist: ");
	    String artist = new String();
	    artist = input.nextLine();
	    if(favourite.remove(title, artist) == true)
	    	System.out.println("remove successfully");
	    else
	    	System.out.println("The song doesn't exist");
	}


	//this fucntion shuffles the playlist
	//by invoking another function
	public void shuffle() {
		favourite.shuffle();
		return;
	}
}
