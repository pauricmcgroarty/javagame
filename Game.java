/*  13/4/2016  */ 
import java.util.Scanner; 
public class Project 
{ 
    public static void main(String [] args) 
    { 
           
              World beeWorld = new World(); 
               
            //Add 2 beepers 
            beeWorld.addBeeper(6, 10); 
            beeWorld.addBeeper(8, 14); 
         
 //-------------------------------------------------------------------------------               
 
                //Add walls/blocks to create maze 
         
                beeWorld.addWall(1, 14, 2,"south"); 
                beeWorld.addWall(3, 14, 2,"south"); 
                beeWorld.addWall(0, 11, 4,"east"); 
                beeWorld.addWall(5, 14, 6,"south"); 
                beeWorld.addWall(6, 11, 2,"east"); 
                beeWorld.addWall(6, 9, 8,"east"); 
 
                beeWorld.addWall(7, 14, 2,"south"); 
                beeWorld.addWall(8, 13, 6,"east"); 
                beeWorld.addWall(13, 12, 2,"south"); 
                beeWorld.addWall(9, 10, 2,"north"); 
                beeWorld.addWall(11, 10, 2,"north"); 
                beeWorld.addWall(0, 9, 4,"east"); 
  
                beeWorld.addWall(1, 8, 4,"south"); 
                beeWorld.addWall(3, 8, 2,"south"); 
                beeWorld.addWall(0, 1, 2,"east"); 
                beeWorld.addWall(1, 2, 2,"north"); 
                beeWorld.addWall(2, 3, 2,"east"); 
                beeWorld.addWall(3, 0, 2, "north"); 
                beeWorld.addWall(2, 5, 2,"east"); 
                beeWorld.addWall(5, 0, 3,"north"); 
 
                beeWorld.addWall(7, 0, 2,"north"); 
                beeWorld.addWall(9, 8, 4,"south"); 
                beeWorld.addWall(8, 7, 4,"west"); 
                beeWorld.addWall(5, 6, 3,"south"); 
                beeWorld.addWall(7, 6, 4, "south"); 
                beeWorld.addWall(9, 1, 3,"north"); 
                beeWorld.addWall(10, 1, 4,"east"); 
 
                beeWorld.addWall(11, 2, 6,"north"); 
                beeWorld.addWall(12, 3, 2,"east"); 
                beeWorld.addWall(12, 5, 2,"east"); 
                beeWorld.addWall(12, 7, 2,"east"); 
                beeWorld.addWall(10, 5, 1,"east"); 
//----------------------------------------------------------------------------------                 
                //Add the Robot 
                SmarterRobot rob = new SmarterRobot(); 
                beeWorld.add(rob, 0, 14); 
//----------------------------------------------------------------------------------- 
               //Instructions for the user 
                System.out.println("Welcome to the robot game!"); 
                System.out.println("You have 100 moves to go pick up the beepers at (6,10), (8,14) and then place them at (10,6)"); 
                System.out.println("Instructions:"); 
                System.out.println(" To move forward, type forward followed by the number of spaces you wish to move \n To turn right, type right \n To turn left, type left \n To turn around, type turnaround \n To pick up a beeper, type collect \n To place a beeper down, type drop \n When you drop the 2 beepers at (10,6), enter finished ."); 
         
        //counter variable will be used to count number of moves taken 
        int counter = 0; 
         
        //movesLeft variable will be used to count number of moves left 
        int movesLeft = 0; 
                 
                Scanner scan = new Scanner(System.in); 
                System.out.println("Enter a command:"); 
                String command = scan.nextLine(); 
                //The user can enter commands in lower case or upper case 
                command = command.toLowerCase(); 
 
               /*This while loop will end with the message "You are out of moves" if 
                 the user takes more than 100 moves*/ 
                
               while (counter < 100) 
               { 
                System.out.println("command = " +command); 
                 
                if(command.startsWith("forward")) 
                { 
                 /*seperator variable seperates command 'forward' and the number 
                   of moves requested*/ 
                 int separator = command.indexOf(" "); 
                 String command1 = command.substring(0,    separator); 
                 String command2 = command.substring(separator+1); 
                 //distance variable is the number of moves requested 
                 int distance = Integer.parseInt(command2); 
                 rob.moveNumOfTimes(distance); 
                 counter = counter + distance; 
                 movesLeft = 100 - counter; 
                 System.out.println("You have " + movesLeft + " moves left."); 
                } 
                 
                    
                   else if ( command.equals("right")) 
                   { 
                    rob.turnRight(); 
                   } 
                   else if ( command.equals("turnaround") ) 
                   { 
                    rob.turnAround(); 
                   } 
         
                   else if ( command.equals("left") ) 
                   { 
                    rob.turnLeft(); 
                   } 
         
                   else if ( command.equals("collect") ) 
                   { 
                    rob.pickBeeper(); 
                   } 
                   else if ( command.equals("drop") ) 
                   { 
                    rob.putBeeper(); 
                   }    
                   else 
                   { 
                     System.out.println("I don't understand!"); 
                   } 
                
                    System.out.println("Enter a command:"); 
                    command = scan.nextLine(); 
               
               
             
                 
            }
			
                 
            System.out.println("You are out of moves!!"); 
              
            if ( command.equals("finished") && this.getNumOfBeepersInCell() == 2)
			{
			System.out.println("Well Done you have won the game");
			}
			else {
			System.out.println("There are not 2 beepers in the cell");
			}
			
			
			
			
			
            
  } 
}