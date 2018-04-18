public class SmarterRobot extends SmartRobot  
{  
       public SmarterRobot() 
       { 
            // inside the SmarterRobot() constructor so going to call the constructor of the  
            // super class ie SmartRobot()  
            super(); 
       } 
 
       public SmarterRobot (String colour) 
       {         
            // inside the SmarterRobot() constructor so going to call the constructor of the  
            // super class ie SmartRobot(colour)  
            super(colour); 
       } 
//################################################################################################################### 
       public void moveNumOfTimes(int num) 
       { 
        // makes robot move the number of times that are passed in as num.  
        //----------------------------------------------------------------------------------------------- 
           int i=0; 
 
           while(i<num)    { 
            if (this.frontIsClear()){ // if the front is NOT clear the robot should not move, otherwise will collide into the wall 
                 this.move(); 
            } 
            i++; // same as i=i+1; 
        } 
         //----------------------------------------------------------------------------------------------- 
       } 
//################################################################################################################### 
       public static void putNumOfBeepers(int num) 
       {  
            //puts down the number of beepers that are passed in as num.  
            //----------------------------------------------------------------------------------------------- 
         int i = 0; 
                 while (i < num){ 
            this.putBeeper(); 
            i++; 
             }       
            //----------------------------------------------------------------------------------------------- 
       } 
//################################################################################################################### 
       public void pickUpNumOfBeepers(int num) 
       { 
            // picks up the number of beepers that are past in as num  
            //----------------------------------------------------------------------------------------------- 
            int i = 0; 
                    while (i < num){ 
                         this.pickBeeper(); 
             i++; 
            }     
             
            //----------------------------------------------------------------------------------------------- 
       } 
//################################################################################################################### 
 
    public static int getNumOfBeepersInCell() 
       { 
         int numOfBeepersInCell = 0; 
           
        // the method returns how many beepers are in the cell that the robot is in.  
        //----------------------------------------------------------------------------------------------- 
          while (this.beeperPresent()){ 
               this.pickBeeper(); 
               numOfBeepersInCell++;   
          } 
           this.putNumOfBeepers(numOfBeepersInCell);                
        //----------------------------------------------------------------------------------------------- 
 
        return numOfBeepersInCell; 
       } 
//################################################################################################################### 
       public String toString()  
       { 
             String str = new String(); 
 
             // write code between the dashed lines to return a string about the smarter robot. 
             //----------------------------------------------------------------------------------------------- 
             str = "beeperPresent() = " +this.beeperPresent()+"\n"+ 
                   "hasBeeper()     = " +this.hasBeeper()+"\n"+ 
                   "frontIsClear()  = " +this.frontIsClear()+"\n"+ 
                  // "backIsClear()   = " +this.backIsClear()+"\n"+ 
                   "leftIsClear()   = " +this.leftIsClear()+"\n"+ 
                   "rightIsClear()  = " +this.rightIsClear()+"\n"; 
              
             //----------------------------------------------------------------------------------------------- 
             return str; 
       } 
//################################################################################################################### 
       public void pickUpCorrectAmount() 
       { 
        int numOfBeepers = this.getNumOfBeepersInCell(); 
                if (numOfBeepers < 5){ 
                   this.pickUpNumOfBeepers(3); 
                } 
                else if (numOfBeepers > 5 && numOfBeepers < 10){ 
                   this.pickUpNumOfBeepers(6); 
                } 
                else if (numOfBeepers  > 10){ 
                   this.pickUpAllBeepers(); 
                } 
         
       } 
 
 
 
//################################################################################################################### 
 
}           // end of the SmarterRobot class