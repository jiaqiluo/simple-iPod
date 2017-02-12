//Jiaqi Luo, CS202, hw4&5, Tree.java, 8/11/2014
//This file contains the declaration of the class Tree


public class Tree extends Base {
	protected Tnode root;
	
	
	//constructor
	public Tree(){
		super();
		root = null;
	}
		
	
	//this function inserts a new item to the tree
	//by calling another function
	//input:
	//      title -- string as the title
	//      artist -- string as the artist
	public void insert(final String title, final String artist){
		root = insert(root, title, artist);
	}
		
	
	
	//this function inserts a new item into the tree recursively
	//it looks for the Tnode which is for this artist as argument,
	//and insert the new song,
	//otherwise, it will creates a new Tnode to save the new song 
	//input:
	//      Tnode -- the root of the tree
	//      title -- string as the title
	//      artist -- string as the artist
	public Tnode insert(Tnode root, final String title, final String artist){
		if(root == null)
		{
			root = new Tnode();
			root.insert(title, artist);
			return root;
		}
		if(root.compare_artist(artist) < 0)
		{
			root.set_right(insert(root.goto_right(), title, artist));
		
		}
		else if(root.compare_artist(artist) == 0)
		{
			root.insert(title, artist);
			return root;
		}
		else
			root.set_left(insert(root.goto_left(), title, artist));
		return root;
	}
		
	
	//this function insert a Tnode to the tree recursively
	//it looks for the Tnode which is for this artist as argument,
	//and insert the new song,
	//otherwise, it will creates a new Tnode to save the new song 
	//input:
	//      root -- Tnode root of the tree
	//      source -- Tnode as source
	protected Tnode insert(Tnode root, final Tnode source){
		if(root == null)
		{
			root = new Tnode(source);
			return root;
		}
		if(root.compare_artist(source) < 0)
		{
			return insert(root.goto_right(), source);
		}
		
		else
			return insert(root.goto_left(), source);
	}
		
	
	//this function displays the tree
	public void display(){
		if(root == null)
			System.out.println("\nEmpty tree");
		display(root);
		return;
	}
		
	
	//this function displays the tree in order 
	//by calling itself recursively
	//input:
	//     root -- Tnode as the root
	protected void display(Tnode root){
		if(root == null)
			return;
		root.display();
		display(root.goto_left());
		display(root.goto_right());
	}

	
	//this function retrieve the tree according to the title and artist
	//and return the Lndoe if found by calling another function
	//input:
	//      title -- string as the title
	//      artist -- string as the artist
	//output:
	//      Lnode -- the Lnode found
	public Lnode retrieve(final String title, final String artist) {
		return retrieve(root, title, artist);
	}

	
	//this function retrieve the tree recursively according to the title and artist
	//and return the Lndoe 
	//input:
	//      root -- Tnode root of the tree
	//      title -- string as the title
	//      artist -- string as the artist
	//output:
	//      Lnode -- the Lnode found
	private Lnode retrieve(Tnode root, final String title, final String artist) {
		if(root == null)
			return null;
		Lnode temp = null;
		int i = root.compare_artist(artist);
		if(i == 0)
		{
			temp = root.retrieve(title);
			return temp;
		}
		else if(i < 0)
		{
			temp = retrieve(root.goto_right(), title, artist);
			return temp;
		}
		else
			temp = retrieve(root.goto_left(), title, artist);
		return temp;
	}
	
	
	//this function removes a particular song from the tree
	//by calling another function
	//input:
	//      title -- string as the title
	//      artist -- string as the artist
	public void remove(final String title, final String artist)
	{
		remove(root, title, artist);
	}

	
	//this function removes a particular song from the tree
	//by calling itself recursively
	//input:
	//      root -- Tnode root of the tree
	//      title -- string as the title
	//      artist -- string as the artist
	private void remove(Tnode root, final String title, final String artist) {
		if(root == null)
			return;
		int i = root.compare_artist(artist);
		if(i == 0)
			root.remove(title, artist);
		else if(i < 0)
		{
			retrieve(root.goto_right(), title, artist);
		}
		else
			retrieve(root.goto_left(), title, artist);
		return;	
	}
}