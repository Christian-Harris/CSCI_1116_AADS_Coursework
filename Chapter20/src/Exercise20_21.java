/*
Author: Christian Harris
Date: 8 October 2020

Description: This program has implemented a recursive selection sort algorithm for array of objects which implement the Comparator interface.
*/
import java.util.Comparator;

public class Exercise20_21 {
  public static void main(String[] args) {
    GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
        new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5), 
        new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
        new Circle(6.5), new Rectangle(4, 5)};

    Circle[] list1 = {new Circle(2), new Circle(3), new Circle(2),
      new Circle(5), new Circle(6), new Circle(1), new Circle(2),
      new Circle(3), new Circle(14), new Circle(12)};
    selectionSort(list1, new GeometricObjectComparator());
    for (int i = 0; i < list1.length; i++)
      System.out.println(list1[i].getArea() + " ");
  }
  
  public static <E> void selectionSort(E[] list, Comparator<? super E> comparator){
	selectionSort(list, 0, list.length - 1, comparator);
  }
  
	public static <E> void selectionSort(E[] list, int low, int high, Comparator<? super E> comparator){
		if(low < high){
			int indexOfMin = low;
			E min = list[low];
			for(int i = low + 1; i <= high; i++){
				if(comparator.compare(list[i], min) < 0){
					min = list[i];
					indexOfMin = i;
				}
			}
			list[indexOfMin] = list[low];
			list[low] = min;
			selectionSort(list, low + 1, high, comparator);
		}
	}
}