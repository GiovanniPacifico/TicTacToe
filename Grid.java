package game;

/**
 * @file Grid.java
 * @author A. Montanaro
 * @date 18/02/2018
 * 
 * Class that represents a 3x3 grid of the game TicTacToe.
 */
public class Grid {
	private static char CROSS =                           'X';
	private static char CIRCLE =                          'O';  
	private char[][] gametable =               new char[3][3];
	private String ret =                                   "";
	
	/**
	 * Constructor method.
	 * Creates a 3x3 grid with all fields set to ' '.
	 */
	public Grid() {
		//initialization of the matrix of gametable
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				gametable[i][j] = ' ';
	}
	
	/**
	 * Method that returns the value (CROSS or CIRCLE) of gametable[x][y].
	 * @param x
	 * @param y
	 * @return value of gametable[x][y]
	 */
	public char getValueAtPosition(int x, int y) {
		if(x < 3 && y < 3)
			return gametable[x][y];
		else
			return 'E'; //error
	}
	
	/**
	 * Place CROSS on gametable[x][y]
	 * @param x
	 * @param y
	 */
	public void placeCross(int x, int y) {
		if(x < 3 && y < 3)	
			gametable[x][y] = CIRCLE;
	}
	
	/**
	 * Place CIRCLE on gametable[x][y]
	 * @param x
	 * @param y
	 */
	public void placeCircle(int x, int y) {
		if(x < 3 && y < 3)
			gametable[x][y] = CIRCLE;
	}
	
	/**
	 * Method that cecks if anyone of the players have won.
	 * @return case of victory (1~16)
	 */
	public int checkVictory() {
		//check for CROSS
		if(gametable[0][0] == CROSS && gametable[0][1] == CROSS && gametable[0][2] == CROSS) return 1;
		if(gametable[1][0] == CROSS && gametable[1][1] == CROSS && gametable[1][2] == CROSS) return 2;
		if(gametable[2][0] == CROSS && gametable[2][1] == CROSS && gametable[2][2] == CROSS) return 3;
		
		if(gametable[0][0] == CROSS && gametable[1][1] == CROSS && gametable[2][2] == CROSS) return 4;
		if(gametable[2][0] == CROSS && gametable[1][1] == CROSS && gametable[0][2] == CROSS) return 5;
		
		if(gametable[0][0] == CROSS && gametable[1][0] == CROSS && gametable[2][0] == CROSS) return 6;
		if(gametable[1][0] == CROSS && gametable[1][1] == CROSS && gametable[1][2] == CROSS) return 7;
		if(gametable[0][2] == CROSS && gametable[1][2] == CROSS && gametable[2][2] == CROSS) return 8;
		
		//check for CIRCLE
		if(gametable[0][0] == CIRCLE && gametable[0][1] == CIRCLE && gametable[0][2] == CIRCLE) return 9;
		if(gametable[1][0] == CIRCLE && gametable[1][1] == CIRCLE && gametable[1][2] == CIRCLE) return 10;
		if(gametable[2][0] == CIRCLE && gametable[2][1] == CIRCLE && gametable[2][2] == CIRCLE) return 11;
		
		if(gametable[0][0] == CIRCLE && gametable[1][1] == CIRCLE && gametable[2][2] == CIRCLE) return 12;
		if(gametable[2][0] == CIRCLE && gametable[1][1] == CIRCLE && gametable[0][2] == CIRCLE) return 13;
		
		if(gametable[0][0] == CIRCLE && gametable[1][0] == CIRCLE && gametable[2][0] == CIRCLE) return 14;
		if(gametable[1][0] == CIRCLE && gametable[1][1] == CIRCLE && gametable[1][2] == CIRCLE) return 15;
		if(gametable[0][2] == CIRCLE && gametable[1][2] == CIRCLE && gametable[2][2] == CIRCLE) return 16;
		
		//in case of no win or error: 
		return 0;
	}
	
	/**
	 * Perform an automated placement of CIRCLE of values on the grid.
	 */
	public void CircleCPU(){
		Random r = new Random();
		int x, y;
		do {
		x = r.nextInt(3);
		y = r.nextInt(3);
		}while(gametable[x][y] != ' ');
		
		gametable[x][y] = CIRCLE;
	}
	
	/**
	 * Perform an automated placement of CROSS of values on the grid.
	 */
	public void CrossCPU(){
		Random r = new Random();
		int x, y;
		do {
		x = r.nextInt(3);
		y = r.nextInt(3);
		}while(gametable[x][y] == ' ');
		
		gametable[x][y] = CROSS;
	}
	
	/**
	 * Overriding of Object.toString().
	 * @return a String that represents the object in the format "- - -\n- - -\n- - -"
	 */
	@Override //overriding method toString of class Object
	public String toString() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				ret.concat(gametable[i][j] + " "); 
			}
			ret.concat("\n");
		}
		return ret;
	}
}