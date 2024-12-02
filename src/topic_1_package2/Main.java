/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic_1_package2;

public class Main {

	public static void main(String[] args) {
		
		//Person Array
		String[] person = {"Mark LEster","19", "Student"};
		
		//Label Array
		String[] label = {"Name:","Age","Occupation"};
		
		System.out.println("");

		System.out.println("Solution 1:");
		System.out.println("----------------------");
		
		for(int i=0; i< person.length; i++) {
			System.out.println(label[i]+": "+person[i]);
			
		}
		
		String[][] personInfo = {
			{
				"Name:", 
				"Mark Lester"
			},
		    {
				"Age:", 
				"19"
			},
		    {   "Occupation:", 
				"Instructor"
			}
		};
		        
		System.out.println("");
		System.out.println("Solution 2:");
		System.out.println("----------------------");
		        
		// Loop through the 2D array and print out each label and value
		for (int i = 0; i < personInfo.length; i++) {
		     System.out.println(personInfo[i][0] + " " + personInfo[i][1]);
		 }
		

	}

}