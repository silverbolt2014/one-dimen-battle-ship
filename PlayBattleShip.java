import java.util.ArrayList;

public class PlayBattleShip {
    public static void main(String[] args) {
        
        int numOfGuesses = 0;
        
        GameHelper helper = new GameHelper();
        
        BattleShip battleShip = new BattleShip();
        
        int randomNum = (int) (Math.random() * 5);
        
        ArrayList<String> locations = new ArrayList<String>();
        locations.add("" + randomNum);
        locations.add("" + (randomNum + 1));
        locations.add("" + (randomNum + 2));
        
        battleShip.setLocationCells(locations);
        
        boolean isAlive = true;
        
        while(isAlive) {
            String guess = helper.getUserInput("enter a number");
            numOfGuesses++;
            
            String result = battleShip.checkYourself(guess);
            
            if ( result.equals("kill") ) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}