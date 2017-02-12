//Jiaqi Luo, CS202, hw4&5, Playlist.java, 8/11/2014
//This file contains the declaration of the class Playlist


public class Playlist extends Base{
	protected Pnode head;
	
	
	//constructor
	public Playlist(){
		super();
		head = null;
	}
	
	
	//this function inserts an Lnode to the playlist as head
	//it checks the current list whether is empty
	//if the head is empty, it will create new head and insert
	//othewise, if the head is full, create a new Lnode as head
	//input:
	//     source -- Lnode as source for adding 
	public void insert(final Lnode source){
		if(head == null)
		{
			head = new Pnode();
			head.insert(source);
		}
		else if(head.insert(source) == false)
		{
			Pnode temp = new Pnode();
			temp.insert(source);
			temp.set_next(head);
			head = temp;
		}
		return;
	}
	
	
	//this function displays the current playlist 
	//by traverseing it 
	public void display() {
		if(head == null)
			System.out.println("\nEmpty playlit.");
		Pnode temp = head;
		while(temp != null)
		{
			temp.display();
			temp = temp.goto_next();
		}
		return;
	}

	
	//this function remove a particular item from the playlist
	//by calling another function
	//input:
	//     title -- string of title for removing
	//     artist -- string of artist for removing
	//output:
	//     true -- remove successfully
	//     false -- cannot find the item 
	public boolean remove(final String title, final String artist) {
		return remove(head, title, artist);
	}

	
	//this function remove a particular item from the playlist recursively
	//input:
	//     head -- Pnode to the current head
	//     title -- string of title for removing
	//     artist -- string of artist for removing
	//output:
	//     true -- remove successfully
	//     false -- cannot find the item 
	private boolean remove(Pnode head, final String title, final String artist) {
		if(head == null)
			return false;
		if(head.remove(title,artist) == true)
			return true;
		else
			return remove(head.goto_next(), title, artist);
	}

	
	//this function shuffles the playlist
	//by calling another function
	public void shuffle() {
		shuffle(head);
		return;
	}

	//this function shuffle the playlist
	//it shuffles each node of the list separately
	private void shuffle(Pnode head) {
		Pnode temp = head;
		while(temp != null){
			temp.shuffle();
			temp = temp.goto_next();
		}
	}
}
