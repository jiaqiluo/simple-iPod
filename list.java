//Jiaqi Luo, CS202, hw4&5, List.java, 8/11/2014
//This file contains the declaration of the class List

public class List {
protected Lnode head;

//constructor,
//set the head to null
public List() {
	head = null;
}

//copy constructor,
//copy another List into the current one recursively
public List(final List source) {
	Lnode temp_head = head;
	Lnode temp_source = source.head;
	while(temp_source != null)
	{
		temp_head = new Lnode(temp_source);
		temp_head = temp_head.goto_next();
		temp_source = temp_source.goto_next();
	}

}

//This function inserts a Lnode as the new head of the list
//input:
//     source - Lnode reference to source
public void insert(final Lnode source) {
	Lnode temp = new Lnode(source);
	temp.set_next(head);
	head = temp;
	return;
}

//this function displays the current list
//by calling another display function
public void display() {
	display(head);
	return;
}

//this function display the current list
//by invoking itself recursively
//input:
//     head - the Lnode reference to the current head
protected void display(Lnode head) {
	if(head == null)
		return;
	head.display();
	display(head.goto_next());
}

//this function compares the artist in the source
//and the head of the list by invoking corresponding function
//input:
//     source -- string for an artist
//output:
//      0 -- the artists in both are the same
//     else number --  the artists in both are different
public int compare_artist(final String source) {
	return head.compare_artist(source);
	}

//this function compares the artist in the source
//and the head of the list by invoking corresponding function
//input:
//     source -- string for an artist
//output:
//      0 -- the artists in both are the same
//     else number --  the artists in both are different
public int compare_artist(final List song_list) {
	return head.compare_artist(song_list.head);
}

//this function inserts an new item(including title and artist)
//into the current list as the new head
//input:
//     title -- string as the title of the head
//     artist -- string as the title of the head
//output:
//     add a new Lnode to the head of the list
public void insert(final String title, final String artist) {
	if(head == null)
	{
		head = new Lnode(title, artist);
		return;
	}
	Lnode temp = new Lnode(title, artist);
	temp.set_next(head);
	head = temp;
	return;
}

//this function retrieve the list based on a particular title,
//and return that Lndoe if found,
//otherwise, return an null Lnode
//input:
//    title -- a string for looking for
//output:
//    Lnode -- the found Lnode or null
public Lnode retrieve(final String title) {
	Lnode temp = head;
	Lnode target = null;
	while(temp != null)
	{
		if(temp.compare_title(title) == 0)
		{
			target = temp;
		}
		temp = temp.goto_next();
	}
	return target;
}

//this function remove a particular Lnode from the list
//it traverses the list, and remove the target if finding it
//input:
//     title -- string of the title looking for
//     artist -- string of the artist looking for
public void remove(String title, String artist) {
	Lnode temp = head;
	Lnode pre = temp;
	while(temp != null && temp.compare_title(title) != 0)
	{
		pre = temp;
		temp = temp.goto_next();
	}
	if(temp != null)
	{
		System.out.println("remove successfully");
		if(temp == pre)
			head = temp.goto_next();
		else
			pre.set_next(temp.goto_next());
	}
	else
		System.out.println("The song doesn't exist.");
	return;
}
}
