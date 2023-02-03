package javaFinalProject;

public class App {

	public static void main(String[] args) {
		
		//Deck instantiated as d1
		Deck d1 = new Deck();
		//instantiated two players
		Player p1 = new Player("Player one");
		Player p2 = new Player("Player two");
		
		//the Deck d1 is then shuffled
		d1.shuffleDeck();
		
		//iterate over to give each players 26 cards from the d1 Deck
		for ( int i = 0; i < 26; i++) {
			p1.draw(d1);
			p2.draw(d1);
		}
		
		//this will be used for the amount of draw
		int draw = 0;
		
		//For the aesthetic
		String sign = " \u2663\uFE0F \u2660 \u2665 \u2666 ";
		int p1NLength = p1.getName().length();
		int p2NLength = p2.getName().length();
		int nameLength = p1NLength + p2NLength;
		String ast1 = "";
		String ast2 = "";
		String stAst = "********";
		String winner = "";
		for ( int i = 0; i <= p1NLength; i++) {
			ast1 += "*";
		}
		
		for (int i = 0; i <= p2NLength; i++) {
			ast2 += "*";
		}
		
		
		//Game begins
		
		System.out.println(stAst + ast1 + "WARS" + ast2 + stAst);
		System.out.println(sign + p1.getName() + " VS " + p2.getName() + sign);
		System.out.println(stAst + ast1 + "****" + ast2 + stAst);
		
		//using traditional for loop to iterate 26 times the flip method
		//while also comparing the values for each flip
		//then also prints out the winning player per turn and their score
		for ( int i = 0; i < 26; i++) {
			//thi will print the turn and the value on each players hand
			System.out.println("Turn" + (i+1) + ": " + p1.handN() + p1.handV() + " VS "+ p2.handN() + p2.handV());
			//this will flip and get the value and assign it to in f1 and f2
			int f1 = p1.flip().getValue();
			int f2 = p2.flip().getValue();
			String win = "";
			
			
			//compare value to determine who wins or if it's a draw
			if ( f1 > f2) {
				p1.incrementScore();
				win = p1.getName();
				System.out.println("\t" + p1.getName() + " Wins!" );
				p1.turn(i+1, win, p1.getScore(), p2.getScore());
				System.out.println("Score: " + p1.getName() + ": " + p1.getScore() + " - " + p2.getName() + ": " + p2.getScore() + "\n");
			} else if (f2 > f1) {
				win = p2.getName();
				p2.incrementScore();
				System.out.println("\t" + p2.getName() + " Wins!" );
				
				p1.turn(i+1, win, p2.getScore(), p1.getScore());
				System.out.println("Score: " + p1.getName() + ": " + p1.getScore() + " - " + p2.getName() + ": " + p2.getScore() + "\n");
			} else {
				win = p1.getName();
				p1.turn(i+1, win, p1.getScore(), p2.getScore());
				System.out.println("\t It's DRAW!\n");
				draw++;
			}
			
			
		} 
		
		//for the final score
		System.out.println("\nFINAL SCORE!!");
		//we use the describe method to print each information
		//for each player
		//and also just print out the times there was a draw.
		p1.describe();
		p2.describe();
		System.out.println("Amount of draw: " + draw);
		
		System.out.println();
		//a simple asterisk box for the winner
		if (p1.getScore() > p2.getScore()) {
			winner = p1.getName();
		} else if ( p1.getScore() < p2.getScore() ) {
			winner = p2.getName();
		} else {
			p1.draw();
		}
		
		
		//for the winner
		int winNLength = winner.length();
		String winAst = "";
		
		for (int i = 0; i < winNLength; i++) {
			winAst += "*";
		}
		if ( p1.getScore() != p2.getScore()) { 
		System.out.println(stAst + "*******" + "WARS" + winAst + stAst);
		System.out.println(sign + "WINNER!" + " :: " + winner + sign);
		System.out.println(stAst + "***********" + winAst + stAst);
		}
	}
	
	

}
