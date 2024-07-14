package test.ArrayList;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> Al=new ArrayList<Integer>();
		for(int i=0;i<=10;i++)
		{
			Al.add(i); //add value on array List
			System.out.println(Al.get(i)); //Print value from array list
			
		}
		System.out.println("Size of Array : "+Al.size());
		for(int j=0;j<Al.size();j++)
		{
			Al.remove(j); //remove value from array list
			
		}
		for(int k=0;k<Al.size();k++)
		{
			System.out.println(Al.get(k)); 
			
		}
		System.out.println("Size of Array after remove : "+Al.size());

	}

}
