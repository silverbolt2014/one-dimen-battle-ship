import java.util.ArrayList;

public class BattleShip {
    ArrayList<String> locationCells;
    
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    
    public String checkYourself (String userInput) {
        String result = "miss";
        
        int index = locationCells.indexOf(userInput);
        
        if (index >= 0) {
            System.out.println("userInput = " + userInput + " was a hit");
            locationCells.remove(index);
            
            if ( locationCells.isEmpty() ){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}