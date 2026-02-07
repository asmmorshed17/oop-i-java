class Rectangle{
int length;
int width ;

Rectangle(int l,int w){
length = l ;
width = w ;
}
public int CalculateArea(){
int Area = length*width;
return Area;
}

public int CalculatePerimeter(){
int Perimeter = 2*(length+width);
return Perimeter;
}
}

class TesterC2{
public static void main(String[]args){

Rectangle R1 = new Rectangle(10,7);
Rectangle R2 = new Rectangle(15,9);

System.out.println("-------------------------------------------------------------");
System.out.println("Rectangle - 1: Length = "+R1.length+" & Width = "+R1.width);
System.out.println("Area of Rectangle - 1 	 = "+R1.CalculateArea());
System.out.println("Perimeter of Rectangle-1 = "+R1.CalculatePerimeter());

System.out.println("-------------------------------------------------------------");
System.out.println("Rectangle - 2: Length = "+R2.length+" & Width = "+R2.width);
System.out.println("Area of Rectangle - 2 	 = "+R2.CalculateArea());
System.out.println("Perimeter of Rectangle-2 = "+R2.CalculatePerimeter());

System.out.println("-------------------------------------------------------------");

}
}

/*
E:\Code\Java\NN Mam Class>javac TesterC2.java

E:\Code\Java\NN Mam Class>java TesterC2
-------------------------------------------------------------
Rectangle - 1: Length = 10 & Width = 7
Area of Rectangle - 1    = 70
Perimeter of Rectangle-1 = 34
-------------------------------------------------------------
Rectangle - 2: Length = 15 & Width = 9
Area of Rectangle - 2    = 135
Perimeter of Rectangle-2 = 48
-------------------------------------------------------------
*/