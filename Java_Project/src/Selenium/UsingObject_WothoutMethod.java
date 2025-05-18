package Selenium;

public class UsingObject_WothoutMethod {

	 	// in this program directly we have created an object of the class and displaying the fields ,

		// no methods used , no constructor used.

		// Fields

			    String name;

			    String address;
			    
			    String standard;

			    // Main method

			    public static void main(String[] args) {

			     // Creating an object

			    UsingObject_WothoutMethod object = new UsingObject_WothoutMethod();

	            // Assigning values directly

			     object.name = "Krishna Krishna";

			      object.address = "Chantily,101, Herndon";
			      
			      object.standard= "5th standard ";

		        // Printing values directly
     
			      System.out.println("Name: " + object.name);

			      System.out.println("Address: " + object.address);
			      
			      System.out.println("standard: "+ object.standard);

				

				

			}



		}