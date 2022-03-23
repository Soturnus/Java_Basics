package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
	
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDouble = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDouble, myObjs);
		printList(myObjs); 
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}


//List<shape> myShapes = new ArrayList<>();
//myShapes.add(new Rectangle(3.0, 2.0));
//myShapes.add(new Circle(2.0));

//List<Circle> myCircles = new ArrayList<>();
//myCircles.add(new Circle(2.0));
//myCircles.add(new Circle(3.0));

//System.out.println("myShape Total area: " + totalArea(myShapes));
//System.out.println("myCircle Total area: " + totalArea(myCircles));

//public static double totalArea(List<? extends shape> list) {
	//	double sum = 0.0;
	//	for (shape s : list) {
	//		sum += s.area();
	//	}
	//	return sum; 
	//} 	