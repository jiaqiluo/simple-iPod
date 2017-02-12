//Jiaqi Luo, CS202, hw4&5, Lnode.java, 8/11/2014
//This file contains the declaration of the class Lnode

//Lnode inherits Song
public class Lnode extends Song{
protected Lnode next;

//constructor
//invoke the super class's constructor
//and set next to null
public Lnode()
{
	super();
	next = null;
}


//constructor
public Lnode(final String title, final String artist){
	super(title, artist);
	next = null;
}


//copy constructor
public Lnode(final Lnode node){
	super(node);
	this.next = node.next;
}


//this function displays the title and artist of the current Lnode
//by invoking super class's finction
public void display(){
	super.display();
	return;
}


//this function return the reference to the next Lndoe
//output:
//      next -- reference to the next Lnode
public Lnode goto_next() {
	return next;
}


//this function set the reference to the next Lndoe
//input:
//      next -- reference to the next Lnode
public void set_next(Lnode next) {
	this.next = next;
	return;
}


//this function compares the artist in the source Lnode and the current one
//by invoking super class's function
//input:
//     source -- reference to Lnode as source
//output:
//     0 -- the artist of both are the same
//     other int -- the artist of both are different
public int compare_artist(final Lnode source)
{
	return super.compare_artist(source.artist);
}


//this function compares the title in the source Lnode and the current one
//by invoking super class's function
//input:
//     source -- reference to Lnode as source
//output:
//     0 -- the title of both are the same
//     other int -- the title of both are different
public int compare_title(final Lnode source)
{
	return super.compare_title(source.artist);
	}
}
