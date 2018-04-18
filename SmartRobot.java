public class SmartRobot extends Robot
{ 
       public SmartRobot()
       {
            // inside the SmartRobot() constructor so going to call the constructor of the 
            // super class ie Robot() 
            super();        
       }

       public SmartRobot(String colour)
       {        
            // inside the SmartRobot(String colour) constructor so going to call the constructor of the 
            // super class ie Robot(String colour)            
            super(colour);        
       }
//###################################################################################################################
       public void moveTwoTimes()
       {            
             // makes the robot move two times
         //-----------------------------------------------------------------------------------------------
                  move();
          move();
        //-----------------------------------------------------------------------------------------------    
       }
//###################################################################################################################
       public void moveFourTimes()
       {            
              // makes the robot move four times
              //-----------------------------------------------------------------------------------------------
              for(int i=1; i<5; i++){
        move();
        }
    
          //-----------------------------------------------------------------------------------------------            
       }
//###################################################################################################################       
       public void moveEightTimes()
       {    
             // makes the robot move eight times
         //-----------------------------------------------------------------------------------------------
           for(int i=1; i<9; i++){
        move();
        }
            //-----------------------------------------------------------------------------------------------
       }
//###################################################################################################################
    

      //------------------------------------------------------------------------------------
          public void turnAround()
       { 
        // this makes the robot turn around
        //-----------------------------------------------------------------------------------------------
            turnLeft();
                turnLeft();
           //-----------------------------------------------------------------------------------------------
       }    
//###################################################################################################################   
       public void turnRight()
       {     
          // this makes the robot turn right
          //-----------------------------------------------------------------------------------------------
                turnLeft();
                turnLeft();
        turnLeft();
                
              //-----------------------------------------------------------------------------------------------
       }
//###################################################################################################################
          public void turnNorth()
          {
         // makes the robot turn north
         //-----------------------------------------------------------------------------------------------
        if (facingSouth())
                {
                    turnAround();
                }
                else if (facingEast())
                {
                    turnLeft();
                }
                else if (facingWest())
                {
                    turnRight();
        }

        //-----------------------------------------------------------------------------------------------
       }
//###################################################################################################################
       public void turnSouth()
       {
       // makes the robot turn south
       //-----------------------------------------------------------------------------------------------
        if (facingNorth())
                {
                    turnAround();
                }
                else if (facingEast())
                {
                    turnRight();
                }
                else if (facingWest())
                {
                    turnLeft();
        }
      //-----------------------------------------------------------------------------------------------
       }
//###################################################################################################################
       public void turnEast()
       {
       // makes the robot turn east
       //-----------------------------------------------------------------------------------------------
    if (facingWest())
                {
                    turnAround();
                }
                else if (facingNorth())
                {
                    turnRight();
                }
                else if (facingSouth())
                {
                    turnLeft();
        }

       //-----------------------------------------------------------------------------------------------
       }
//###################################################################################################################
       public void turnWest()
       { 
             // makes the robot turn west
             //-----------------------------------------------------------------------------------------------
            if (facingEast())
                {
                    turnAround();
                }
                else if (facingNorth())
                {
                    turnLeft();
                }
                else if (facingSouth())
                {
                    turnRight();
        }
             //-----------------------------------------------------------------------------------------------
       }

//###################################################################################################################
       public boolean rightIsClear()
       {         
             boolean rightClear = false;


             //-----------------------------------------------------------------------------------------------                     
                   turnRight();
                     if (frontIsClear())
                     {
                          rightClear = true;
                     }
              turnLeft();                
         //-----------------------------------------------------------------------------------------------
            return rightClear;
      }
//###################################################################################################################
      public boolean leftIsClear()
      {
             boolean leftClear  = false;
        
        turnLeft();
        if(frontIsClear())
        {
            leftClear=true;
        }
            turnRight();
        

           //-----------------------------------------------------------------------------------------------                        
             

          //-----------------------------------------------------------------------------------------------

             return leftClear;
      }
//###################################################################################################################

       public void pickUpAllBeepers()
       {

            //-----------------------------------------------------------------------------------------------
        while (beeperPresent())
                {       
                     pickBeeper();
                }
             //-----------------------------------------------------------------------------------------------   
       }
//###################################################################################################################
       public void putAllBeepers()
       {
         
        while(beeperPresent())
        {
            putBeeper();
        }
         //-----------------------------------------------------------------------------------------------
        
             //-----------------------------------------------------------------------------------------------
       } 
//###################################################################################################################
         public String toString()
       {  
             String str = new String();

            
             //-----------------------------------------------------------------------------------------------                        
                    str =  super.toString(); 

             //-----------------------------------------------------------------------------------------------

             return str;
       }
//###################################################################################################################        




}