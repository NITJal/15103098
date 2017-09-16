import java.util.*;
 abstract class shape{
	abstract void Sides();
}
class Square extends shape{
	  void Sides(){
		System.out.println("No of Sides: 4 ");
	}
}
class Triangle extends shape{
	 public void Sides(){
		System.out.println("No of Sides: 3 ");
	}
}
class Octagon extends shape{
	 public void Sides(){
		System.out.println("No of Sides: 8  ");
	}
}

public class Abstract_Class {
      public static void main(String args[]){
    	  Scanner sc=new Scanner(System.in);
    	  Triangle t=new Triangle();
    	  Square s=new Square();
    	  Octagon o=new Octagon();
    	  System.out.println("Enter your  choice:: \n1.Triangle\n2.Square\n3.Octagon");
    	  int t= sc.nextInt();
    	  if(t==1){
    		  tr.no_of_Sides();
    	  }
    	  else if(t==2){
    		  trap.no_of_Sides();
    	  }
    	  else if(t==3){
    		  hex.no_of_Sides();
    	  }
    	  else{
    		  System.out.println("Invalid Selection");
    	  }
      }
}
