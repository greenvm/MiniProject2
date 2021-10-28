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

  


}