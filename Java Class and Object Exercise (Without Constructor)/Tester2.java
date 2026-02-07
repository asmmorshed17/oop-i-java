class Rectangle{
int length;
int width ;

public int CalculateArea(){
int Area = length*width;
return Area;
}

public int CalculatePerimeter(){
int Perimeter = 2*(length+width);
return Perimeter;
}
}

class Tester2{
public static void main(String[]args){

Rectangle R1 = new Rectangle();
Rectangle R2 = new Rectangle();
Rectangle R3 = new Rectangle();

R1.length = 10;
R1.width = 7 ;
R2.length = 15 ;
R2.width= 9 ;
R3.length = 16 ;
R3.width = 13 ;

R1.CalculateArea();
R1.CalculatePerimeter();
R2.CalculateArea();
R2.CalculatePerimeter();

System.out.println("-------------------------------------------------------------");
System.out.println("Rectangle - 1: Length = "+R1.length+"& Width = "+R1.width);
System.out.println("Area of Rectangle - 1 	 = "+R1.CalculateArea());
System.out.println("Perimeter of Rectangle-1 = "+R1.CalculatePerimeter());

System.out.println("-------------------------------------------------------------");
System.out.println("Rectangle - 2: Length = "+R2.length+"& Width = "+R2.width);
System.out.println("Area of Rectangle - 2 	 = "+R2.CalculateArea());
System.out.println("Perimeter of Rectangle-2 = "+R2.CalculatePerimeter());

System.out.println("-------------------------------------------------------------");
System.out.println("Rectangle - 3: Length = "+R3.length+"& Width = "+R3.width);
System.out.println("Area of Rectangle - 3 	 = "+R3.CalculateArea());
System.out.println("Perimeter of Rectangle-3 = "+R3.CalculatePerimeter());
System.out.println("-------------------------------------------------------------");
}
}