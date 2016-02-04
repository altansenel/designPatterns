package template;

public class TemplatePatternDemo {
	   public static void main(String[] args) {

	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();	
	      
	      System.out.println();
	      Cricket game2 = new Cricket();
	      game2.play();
	      
	   }
	}