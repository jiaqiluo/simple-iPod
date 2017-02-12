//Jiaqi Luo, CS202, hw4&5, Tnode.java, 8/11/2014
//This file contains the declaration of the class Tnode

public class Tnode 
{
	protected List song_list;
	protected Tnode left;
	protected Tnode right;
	
	
	//constructor
	public Tnode(){
		song_list = null;
		left = null;
		right = null;
	}

	
	//copy constructor
	public Tnode(final Tnode source) {
		song_list= new List(source.song_list);
		left = source.left;
		right = source.right;
	}
	

	
	//this function sets the left reference to the argument
	//input:
	//     left -- the reference to Tnode as left
	public void set_left(final Tnode left){
		this.left = left;
		return;
	}
	
	
	//this function sets the right reference to the argument
	//input:
	//     right -- the reference to Tnode as right
	public void set_right(final Tnode right){
		this.right = right;
		return;
	}
	
	
	//this function return the reference to left Tnode
	//output:
	//     left -- reference to left Tnode
	public Tnode goto_left() {
		return left;
	}
	
	
	//this function return the reference to right Tnode
	//output:
	//     right -- reference to right Tnode
	public Tnode goto_right() {
		return right;
	}
	
	
	//this function displays the current song list
	public void display()
	{
		if(song_list != null)
		{
			System.out.println("\n------------------");
			song_list.display();
		}
	}
	
	
	
	//this function compares the artist in the current songlist and argument
	//input:
	//     source -- string for comparing
	//output:
	//     0 -- the artists are the same
	//     other value -- they are different
	public int compare_artist(final String source) {
		return song_list.compare_artist(source);
	}
	

	//this function compares the artist in the current songlist and argument
	//input:
	//     source -- Tnode for comparing
	//output:
	//     0 -- the artists are the same
	//     other value -- they are different
	public int compare_artist(final Tnode source) {
		return song_list.compare_artist(source.song_list);
	}
	
	
	//this function insert a new item to the song_list
	//input:
	//     title -- string as the title 
	//     artist -- string as the artist
	public void insert(final String title, final String artist) {
		if(song_list == null)
		{
			song_list = new List();
			song_list.insert(title, artist);
			return;
		}
		song_list.insert(title, artist);
		return;
	}

	
	//this function return the Lnode which is found depending on the title
	//input:
	//     title -- string as the title
	//output:
	//     lnode -- the Lnode looking for
	public Lnode retrieve(final String title) {
		return song_list.retrieve(title);
	}

	
	//this function removes a item from the song_list
	//input:
	//     title -- string as the title 
	//     artist -- string as the artist
	public void remove(final String title, final String artist) {
		song_list.remove(title, artist);
		return;	
	}
}
