//Jiaqi Luo, CS202, hw4&5, main.java, 8/11/2014
//This file contains the declaration of the class Main


import java.util.Scanner;


public class Main {
	protected static Scanner input;
	public static void main(String [] arg){
		Management test = new Management();
		int choice;
		test.display_tree();
		test.display_list();
		do{
			System.out.println("\n--------Option----------" +
				               "\n\t1. display library and playlist" +
				               "\n\t2. add a song to playlist" +
				               "\n\t3. remove a song from playlist" +
				               "\n\t4. shuffle the playlist" +
				               "\n\t5. exit");
			System.out.print("what do you want to do(enter a number): ");
			input = new Scanner(System.in);
			while (!input.hasNextInt()) {
			    System.out.print("only integers!: ");
				input = new Scanner(System.in);
			}
			choice = input.nextInt();
			if(choice == 1){
				test.display_tree();
				test.display_list();
			}
			else if(choice == 2){
				test.add_a_song_to_list();
				test.display_tree();
				test.display_list();
		    }
		    else if(choice == 3){
		    	System.out.println("test remove a song: ");
		    	test.remove_a_song();
				test.display_list();
		    }
		    else if(choice == 4){
		    	test.shuffle();
		    	test.display_tree();
				test.display_list();
		    }
		}while(choice < 5);
		System.out.println("Thanks for using.");
		return;
	}
}
