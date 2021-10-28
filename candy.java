import java.util.Random;

class Candy {
  private String candyName;

//array list of all the types of candy someone can get
  String candyNameList[] = new String[] { "bag(s) of M&Ms" , "package(s) of pink Starbursts" , "kings size Hershey's" , "Milky Way(s)" , "Twix" , "Reese's" , "Kit Kat"
  };
//default constructor
  Candy () {
    candyName = ""; 
  }
  
//constuctor with aName parameter  
  Candy (String aCandyName) {
    candyName = aCandyName; 
  }

//mutator method
  void setCandyName (String aCandyName) {
    candyName = aCandyName; 
  }

//accessor method
  String getCandyName() {
    return candyName;
  }

//method to print without typing system.out.println
  void print() {
    System.out.println(candyName); 
  }

//randome number generator for the candy
 String getCandy(){
   
   Random rand = new Random();

      int randCandyGen = rand.nextInt(101);

      if(randCandyGen > 1 && randCandyGen <= 10){
        return(candyNameList[0]);
      }
      else if(randCandyGen > 10 && randCandyGen <= 30){
        return(candyNameList[1]);
      }
      else if(randCandyGen > 30 && randCandyGen <= 45){
        return(candyNameList[2]);
      }
      else if(randCandyGen > 45 && randCandyGen <= 55){
        return(candyNameList[3]);
      }
      else if(randCandyGen > 55 && randCandyGen <= 70){
        return(candyNameList[4]);
      }
      else if(randCandyGen > 70 && randCandyGen <= 95){
        return(candyNameList[5]);
      }
      else{
        return(candyNameList[6]);
      }
 }

}