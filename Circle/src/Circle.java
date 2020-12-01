
public class Circle {

	double raduis=0;
	
	public Circle(){ //Constructor
		
	}
	public Circle(double r){
		raduis = r;
	}
	
	public double getArae(){

		return  (raduis* raduis *Math.PI);
		}
	
	
	public double getPerimeter(){
		
		return  (2*raduis*Math.PI);
	}
	
	public void get_Circle_data(){
		System.out.println("Circle raduis is " +" " + raduis);
		System.out.println("Circle Area is " +" " + getArae() );
		System.out.println("Circle perimeter is " +" " + getPerimeter());
	}
}
