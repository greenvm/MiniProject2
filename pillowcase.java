import java.util.ArrayList;

class Pillowcase {
  
//arraylist for the candy
  ArrayList<Object> candyList = new ArrayList<Object>(); 

//how much the pillowcase can hold
  double pillowcaseMaxSize = 1000.0; 
//how to keep track of how much candy people are getting
  int candy; 

//function getting new candy
void receivedCandy (){
Candy newCandy = new Candy();

System.out.println("Trick or Treat!");

String candyReceived = newCandy.getCandy();
System.out.print("We got a " + candyReceived);
candyList.add(candyReceived);
}

void printNumCandies() {
  int candyNames[] = new int[7];
  Candy newCandy = new Candy();

//for loop to count how much candy
  for( candy=0; candy < candyList.size(); candy++ ){
  String candyName = candyList.get(candy).toString();
      
      if(candyName.equals(newCandy.candyList[0])){
        candyNames[0]++;
      }
      else if(candyName.equals(newCandy.candyList[1])){
        candyNames[1]++;
      }
      else if(candyName.equals(newCandy.candyList[2])){
        candyNames[2]++;
      }
      else if(candyName.equals(newCandy.candyList[3])){
        candyNames[3]++;
      }
      else if(candyName.equals(newCandy.candyList[4])){
        candyNames[4]++;
      }
      else if(candyName.equals(newCandy.candyList[5])){
        candyNames[5]++;
      }
      else if(candyName.equals(newCandy.candyList[6])){
        candyNames[6]++;
      }
}

for( i=0; i < newCandy.candyList.length; i++){
      System.out.println("We got " + candyNames[i] + " piece(s) of " + newCandy.candyList[i] + ".");
    }



}
}