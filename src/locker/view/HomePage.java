package locker.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class HomePage {
	  private String product = "Welcome to LockMe Application!";
	  private String developerDetails = "Developer: Devansh Kapoor";
	  int selection;
	  String userName;
	  String username;
	public  String  unn;
	   
	    Scanner sc=new Scanner(System.in);
	   
	    
	    public HomePage()
	    {   
	        File myFile=new File("userpass.txt"); 		
		}
	    
	    public void introduction() throws IOException
	    {
	    	System.out.println(product);
	        System.out.println(developerDetails);
	    	display();
	    }
	    public void display() throws IOException {
	    	System.out.println("Main Menu");
	        System.out.println("1. Show Current Files");
	        System.out.println("2. Register");
	        System.out.println("3. Login");
	        System.out.println("4. Exit");
	        Scanner sc=new Scanner(System.in);
		    int selection=sc.nextInt();
		    userSelection(selection);
		    
	    }
	   
	    public void userSelection(int selection) throws IOException {
	    

	        while(selection!= 4) {
	        	
	            this.options(selection);
	           
	        }
	        if(selection==4)
	        {
	        	System.exit(9);
	        }
	    }
	    public void options(int selected) throws IOException
	    {
	    	
	    	switch(selected)
	    	{
	    	case 1: // Show Files in Directory
                  	showFiles();
                    display();
                    break;
	    	case 2://Register new user
	    		registerUser();
	    		display();
	    		break;
	    	case 3://Login an existing user
	    		login();
	    		display();
	    		
	    		
	    	break;
	    		
	    		
	    	 default:
	                System.out.println("Invalid Option");
	                display();
	                break;

	    }
	    
	    
}
	    public void showFiles()
	    {
//Specify your own path here,your path would be visible where your project is stored in your system
			File folder= new File("C:\\Users\\Devansh Kapoor\\Desktop\\sql\\CompanyLockers");

	    	 
	        String[] file1 = folder.list();
	      List<String> files=  Arrays.asList(file1);
	        Collections.sort(files);
	 
	        for (String file : files)
	        {
	            System.out.println(file);
	        }
	    }
	    public void registerUser() throws IOException
	    {
	    	System.out.println("Enter your username");
	    	  userName = sc.next();
	    	 String un=userName;
	    	 userName = userName+".txt";
	    	
	    	  try (BufferedReader br1 = new BufferedReader(new FileReader("userpass.txt"))) {
	  			String st;
	  			  while ((st = br1.readLine()) != null)
	  			    if(st.equals(un))
	  			    {
	  			    	System.out.println("Username already taken,try another username");
	  			    	display();
	  			    
	  			    }
	  			  
	  		}
	    	 
	  
	    		File myFile=new File(userName);

	         System.out.println("You are adding a user named: " + un);
	        	
	 			try {	
	 		      if (myFile.createNewFile()) {
	 		    	  System.out.println("File created: " + userName);
	 		    	
	 		    	  
	 		      } else {
	 		        System.out.println("This User Already Exits, no need to add another");
	 		        display();
	 		      }
	 		}catch (IOException e){
	 			System.out.println(e);
	 		}
	 			System.out.println("Enter your password");
		    	 String passWord = sc.next();	
		    	 
		    	   
		            try {
		                FileWriter fileWriter = new FileWriter("userpass.txt",true);
		                fileWriter.write(un+"\n");
		               
		                fileWriter.write(passWord+"\n");
		                System.out.println("Registration Successful");
		             fileWriter.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }

	    }
	    public void login() throws IOException
	    {
	    	System.out.println("Enter your username");
	     	username=sc.next();
	   unn=username;
	    username =username+".txt";
		
	  //Specify your own path here,your path would be visible where your project is stored in your system
		File myFile = new File("C:\\Users\\Devansh Kapoor\\Desktop\\sql\\CompanyLockers");
		
		
		String[] flist = myFile.list();
		int flag = 0;
		if (flist == null) {
			System.out.println("Database is empty");
		}
		else {

			// Linear search in the array
			for (int i = 0; i < flist.length; i++) {
				String filename = flist[i];
				if (filename.equals(username)) {
					System.out.println("Enter password");
					 String	password=sc.next();
					  BufferedReader br = new BufferedReader(new FileReader("userpass.txt"));
					  
					  String st;
					  while ((st = br.readLine()) != null)
					    if(st.equals(unn))
					    {
					    	st=br.readLine();
					    	if(st.equals(password))
					    	{
					    		System.out.println("Login Successful");
					    		OptionsPage op1=new OptionsPage(unn);
					    		
					    	}
					    	else
					    		System.out.println("Invalid Credentials");
					    	
					    }
					flag = 1;

				   
				}
			}
		}

		if (flag == 0) {
			System.out.println("User not found,try again");
			}
	    }
	
   }

