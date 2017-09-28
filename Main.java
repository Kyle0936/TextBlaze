import java.util.Scanner;
import java.util.*;
import java.lang.Object;
import java.io.IOException;

public class Main {

	private static int dieTimes = 0;

	public static void main(String[] args) throws InterruptedException, IOException {
		start();

	}

	public static void youDied() throws InterruptedException, IOException {
		dieTimes ++;
		System.out.println("I'm serious.");
		Thread.sleep(500);
		System.out.println("You have to follow the rule.");
		System.out.println();
		Thread.sleep(1000);
		System.out.println("YOU DIED");
		Thread.sleep(1000);
		judge();
		Thread.sleep(2000);
		// System.out.flush();
		// for (int i = 0; i < 50; ++i) System.out.println();
		clearScreen();
		start();
	}

	public static void start() throws InterruptedException, IOException {
		System.out.println("Welcome back to TextBlaze!");
		Thread.sleep(1000);
		System.out.println("You are in a blaze full of tricks.");
		Thread.sleep(1000);
		System.out.println("You have to follow the rule.");
		Thread.sleep(1000);
		System.out.println("...Or there's no way you can escape this blaze.");
		Scanner sc = new Scanner(System.in);
		Thread.sleep(1000);
		System.out.println("Enter: ");
		Thread.sleep(5000);
		System.out.println("ENTER ANYTHING, EXCEPT '1'");
		Thread.sleep(500);
		System.out.println("                                                                            lie");
		Thread.sleep(200);
		clearScreen();
		Thread.sleep(2000);
		String x = sc.nextLine();
		if (!x.equals("1"))
			youDied();
		else firstStep();
	}

	public static void firstStep() throws InterruptedException, IOException {
		clearScreen();
		System.out.println("You are infront of a wall. You have only two choices:");
		Thread.sleep(500);
		System.out.println("1. Use your head to knock the wall for 1000 times.");
		Thread.sleep(500);
		System.out.println("2. Suicide.");
		Thread.sleep(500);
		System.out.println("Enter(1/2): ");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		if(x.equals("1")) {
			secondStep();
		}
		else if(x.equals("2"))
			youDied();
		else
			youDied();
	}
	
	public static void secondStep() throws InterruptedException, IOException {
		clearScreen();
		Scanner sc = new Scanner(System.in);
		System.out.println("The wall disappears when you try to knock it with your head.");
		System.out.println("#Bazinga!#");
		Thread.sleep(1000);
		System.out.println("Now you are at the crossroads:");
		Thread.sleep(500);
		System.out.println("1. Turn left and fight with a dragon");
		Thread.sleep(500);
		System.out.println("2. Turn right and find a trap");
		Thread.sleep(500);
		System.out.println("3. Move forward to save a princess");
		Thread.sleep(500);
		System.out.println("4. Turn round");
		Thread.sleep(500);
		System.out.println("Enter(1/2/3/4): ");
		String x = sc.nextLine();
		if(x.equals("2")) {
			thirdStep();
		}
		else if(x.equals("1"))
			fourthStep();
		else if(x.equals("3")) {
			System.out.println("The princess becomes a monster and eat you.");
			youDied();
		}
		else
			youDied();
	}
	
	public static void fourthStep() throws InterruptedException, IOException{
		clearScreen();
		Scanner sc = new Scanner(System.in);
		System.out.println("The dragon can defeat you easily although you still have a chance to win:");
		Thread.sleep(500);
		System.out.println("1. Turn left and run away.");
		Thread.sleep(500);
		System.out.println("2. Try to fight with the dragon.");
		Thread.sleep(500);
		System.out.println("Enter(1/2/3): ");
		String x = sc.nextLine();
		if(x.equals("1")) {
			fifthStep();
		}
		else if(x.equals("2"))
			youDied();
		else if(x.equals("3")) {
			System.out.println("Do you think this is the 'chance' to win? NO WAY! Naive!");
			Thread.sleep(800);
			youDied();
		}
		else
			youDied();
	}
	
	public static void fifthStep() throws InterruptedException, IOException{
		clearScreen();
		Scanner sc = new Scanner(System.in);
		System.out.println("There are two directions you can go now:");
		Thread.sleep(500);
		System.out.println("1. Turn left and keep running.");
		Thread.sleep(500);
		System.out.println("2. Turn round and try to fight with the dragon.");
		Thread.sleep(500);
		System.out.println("Enter(1/2): ");
		String x = sc.nextLine();
		if(x.equals("1")) {
			System.out.println("You turn left and get caught by another dragon");
			sixthStep();
		}
		else if(x.equals("2"))
			youDied();
		else
			youDied();
	}
	
	public static void sixthStep() throws InterruptedException, IOException{
		clearScreen();
		Scanner sc = new Scanner(System.in);
		System.out.println("The dragon holds you in his hand and ask you where you are right now:");
		Thread.sleep(500);
		System.out.println("1. In a dragon's hand");
		Thread.sleep(500);
		System.out.println("2. In a f*** blaze.");
		Thread.sleep(500);
		System.out.println("3. Somewhere else.");
		Thread.sleep(500);
		System.out.println("Enter(1/3): ");
		String x = sc.nextLine();
		if(x.equals("1")) {
			System.out.println("The dragon agrees with you and then eat you.");
			youDied();
		}
		else if(x.equals("3")) {
			System.out.println("Then, where are you in your opinion?");
			Thread.sleep(500);
			System.out.println("1. At the starting point");
			Thread.sleep(500);
			System.out.println("2. At the end of this blaze");
			Thread.sleep(500);
			System.out.println("Enter(1/2): ");
			String y = sc.nextLine();
			if(y.equals("2")) {
				System.out.println("Do you have a little bit sense of direction?");
				Thread.sleep(500);
				youDied();
			}
			else if(y.equals("1")) {
				System.out.println("You are right");
				Thread.sleep(500);
				System.out.println("The wall at the beginning suddenly reappear." );
				Thread.sleep(500);
				System.out.println("The dragon's hand is cut by the wall. You are free!" );
				Thread.sleep(500);
				secondStep();
			}
			else 
				youDied();
		}
		else
			youDied();
	}
	
	public static void thirdStep() throws InterruptedException, IOException {
		clearScreen();
		System.out.println("There's a trap in front of you.");
		Thread.sleep(500);
		System.out.println("1. Jump");
		Thread.sleep(500);
		System.out.println("2. Build a bridge");
		Thread.sleep(500);
		System.out.println("3. Suicide");
		Thread.sleep(500);
		System.out.println("Enter(1/2/3): ");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		if(x.equals("1")) {
			finalStep();
		}
		else if(x.equals("2")) {
			System.out.println("Why do you think you can build a bridge with nothing?");
			clearScreen();
			thirdStep();
		}
		else
			youDied();
	}
	
	public static void finalStep() throws InterruptedException, IOException{
		clearScreen();
		System.out.println("Seems like the exit of the blaze is infront of you, which is a dark hole");
		Thread.sleep(1500);
		System.out.println("You have two choices:");
		Thread.sleep(500);
		System.out.println("1. Jump into the exit and end this nightmare.");
		Thread.sleep(500);
		System.out.println("2. Suicide");
		Thread.sleep(500);
		System.out.println("Enter(1/2): ");
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		if(x.equals("1")) {
			System.out.println("Are you sure about that?");
			Thread.sleep(500);
			System.out.println("1. Sure.");
			Thread.sleep(500);
			System.out.println("2. Suicide");
			Thread.sleep(500);
			System.out.println("Enter(1/2): ");
			String y = sc.nextLine();
			if(y.equals("1")) {
				System.out.println("Ahhhhhhhhhhhhhhh");
				youDied();
			}
			else {
				System.out.println("Nice try! What a brave move! There's just one more question for you to win!");
				Thread.sleep(1000);
				System.out.println("Is Trump a good president?");
				if(sc.nextLine().equals("No")) {
					System.out.println("You win! Congratulations!");
				}
				else
					youDied();
			}
		}
		else if(x.equals("2"))
			youDied();
		else
			youDied();
	}
	
	public static void start1() throws InterruptedException, IOException {
		System.out.println("Welcome to TextBlaze!");
		Thread.sleep(1000);
		System.out.println("You are in a blaze full of tricks.");
		Thread.sleep(1000);
		System.out.println("You have to follow the rule.");
		Thread.sleep(1000);
		System.out.println("...Or there's another way you can escape this blaze.");
		Thread.sleep(1000);
		System.out.println("Enter: ");
		Thread.sleep(5000);
		System.out.println("ENTER ANYTHING, EXCEPT '1'");
		Thread.sleep(500);
		System.out.println("                                                                                   lie");
		Thread.sleep(200);
		clearScreen();
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		if (x.equals("I am stupid. Please let me win, 帅气的developer.")) {
			System.out.println("YOU WIN");
			Thread.sleep(10000);
			clearScreen();
			Thread.sleep(1000);
			System.out.println("Satisfied? Frustrated? Mad? After all, I hope you still have had fun XD, you HONEST CHEATER");
			return;
		} 
		else if(!x.equals("1"))
			youDied();
		else
			firstStep();
	}

	public static void clearScreen() {
		for (int i = 0; i < 50; ++i)
			System.out.println();
	}

	public static void judge() throws InterruptedException, IOException {
		if (dieTimes < 3) {
			System.out.println("Be more careful.");
		}
		if (dieTimes >= 3 && dieTimes < 5) {
			System.out.println("Maybe you are not clever enough to play this game.");
		}
		if (dieTimes >= 5 && dieTimes < 8) {
			System.out.println("You should give up. Seriously.");
		}
		if (dieTimes >= 8 && dieTimes < 10) {
			System.out.println("How can you still not get mad?");
			System.out.println("Do you think you can get out of the blaze by dying more than 20 times?");
		}
		if (dieTimes >= 10) {
			String x = "I am stupid. Please let me win, 帅气的developer.";
			System.out.println("Please enter:" + x);
			Scanner sc = new Scanner(System.in);
			Thread.sleep(10000);
			if (sc.nextLine().equals(x)) {
				System.out.println("DONT COPY & PASTE. You need to say that from your heart!");
				Thread.sleep(2000);
				clearScreen();
				start1();
			} else {
				youDied();
			}
		}
	}

}
