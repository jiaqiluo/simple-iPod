//Jiaqi Luo, CS202, hw4&5, Pnode.java, 8/11/2014
//This file contains the declaration of the class Pnode


import java.util.Random;


public class Pnode {
	protected Lnode array[];
	protected Pnode next;
	
	//constructor
	//declare an array of Lnode with the size 10
	public Pnode(){
		array = new Lnode[10];
		for(int i = 0; i < 10; ++ i)
			array[i] = null;
		next = null;
	}
	
	
	//this function inserts a new Lnode to the current Pnode
	//input:
	//     source -- Lnode as the source
	//output:
	//     true -- insert successfully
	//     false -- the source is null
	public boolean insert(Lnode source) {
		if(source != null){
			for(int i = 0; i < 10; ++ i){
				if(array[i] == null){
					array[i] = source;
					return true;
				}
			}
		}
		return false;
	}
	
	
	//set the next to the source
	//input:
	//    next -- Pnode reference to the next 
	public void set_next(Pnode next) {
		this.next = next;
		return;
	}
	
	
	//this function return the reference to the next Pnode
	//output:
	//      next -- Pnode reference to the next
	public Pnode goto_next() {
		return next;
	}
	
	
	//this function displays informations in the current Pnode
	//by calling array's display function
	public void display() {
		for(int i = 0; i < 10; ++ i){
			if(array[i] != null)
				array[i].display();
		}
		return;
	}

	
	//this function retrieves the Pnode to find a particular Lnode 
	//depending on the argument
	//input:
	//     title -- string as the title looking for
	//     artist -- string as the artist looking for
	//output:
	//     temp -- the Lnode find out(it might be null)
	public Lnode retrieve(final String title, final String artist) {
		Lnode temp = null;
		for(int i = 0; i < 10; ++ i){
				if(array[i].compare_artist(artist) == 0)
					if(array[i].compare_title(title) == 0)
						temp = array[i];
			}
		return temp;
	}
	
	
	//this function removes a particular from the Pnode
	//input:
	//     title -- string as the title looking for
	//     artist -- string as the artist looking for
	//output:
	//     true -- remove successfully
	//     false -- cannot find it
	public boolean remove(final String title, final String artist)
	{
		boolean find = false;
		for(int i = 0; i < 10; ++ i)
		{
			if(array[i] != null && array[i].compare_artist(artist) == 0)
				if(array[i].compare_title(title) == 0)
					{
						array[i] = null;
						find = true;
					}
		}
		return find;
	}

	
	//this function shuffles the array in the Pnode
	public void shuffle() {
		Random rgen = new Random();  // Random number generator			
		for (int i = 0; i < 10; ++ i) {
		    int randomPosition = rgen.nextInt(10);
		    Lnode temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
	}
}