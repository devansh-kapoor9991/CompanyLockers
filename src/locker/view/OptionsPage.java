package locker.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;


public class OptionsPage {
	
	 
	    Scanner sc=new Scanner(System.in);
	   public String unn=" ";
	 public int flag=1;
	    public OptionsPage(String unn) throws IOException
	    {
	    	this.unn=unn;
	        System.out.println("1. Store Credentials");
	        System.out.println("2. Fetch Credentials");
	        System.out.println("3. Delete File");
	       
	        System.out.println("4. Back to menu");
	        
	        Scanner sc=new Scanner(System.in);
		    int selectOption=sc.nextInt();
		    userSelection(selectOption);
		
	    } 
	    public void userSelection(int selection) throws IOException {
	    

	        while(selection!= 4) {
	            this.options(selection);     
	        }
	        if(selection==4)
	        {
	        	HomePage hp=new HomePage();
	        	hp.display();
	        }
	    }
	    public void options(int selected) throws IOException
	    {	
	    	switch(selected)
	    	{
	    	case 1: // Store credentials 
                  storeCredentials(unn);                 
                  OptionsPage op=new OptionsPage(unn);
                    break;
	    	    	
	    	case 2: // Fetch credentials from file
	    		fetchCredentials(unn);
	    		OptionsPage op1=new OptionsPage(unn);
	    		
	    	case 3:// Delete the file
	    		deleteFile(unn);
	    		HomePage hp=new HomePage();
	    		hp.display();
	    		    		
	    	 default:
	                System.out.println("Invalid Selection");
	                OptionsPage op2=new OptionsPage(unn);
	                break;
	    }
	    }
	   public void storeCredentials(String unn) throws IOException
	   {
			
			System.out.println("Welcome to your file locker,please enter the details you wish to store");
			//	File myFile=new File(unn);
				unn=unn+".txt";
               FileWriter fileWriter = new FileWriter(unn,true);
               System.out.println("Enter website whose credentials you want to add");
               String web=sc.next();
            try ( BufferedReader br2= new BufferedReader(new FileReader(unn)))
            {
              
       			String st1 ;
       			
       			  while ((st1 = br2.readLine()) != null)
       			  {
       			    if(st1.equals(web))
       			    {
       			    	System.out.println("Credentials already stored,store another website");
       			   flag=0;
       			    }
       			  }
       			  
            }
               if(flag==1)
               {
               System.out.println("Enter username for the website");
               String webuser=sc.next();
               System.out.println("Enter password");
               String webpass=sc.next();
               
               fileWriter.write(web+"\n");
               fileWriter.write(webuser+"\n");
               fileWriter.write(webpass+"\n");
               
              System.out.println("Your Credentials have been stored");
              
           
            fileWriter.close();
               }
	   }
	   public void fetchCredentials(String unn)throws IOException
	   { int f=0;
		   System.out.println("Welcome to your file locker,please enter the website whose credentials you wish to fetch");
		   	unn=unn+".txt";
		   String fetch=sc.next();
		   try (BufferedReader br1 = new BufferedReader(new FileReader(unn))) {
			String st;
			  while ((st = br1.readLine()) != null)
			    if(st.equals(fetch))
			    {
			    	String st1=br1.readLine();
			    	String st2=br1.readLine();
			    	System.out.println("Your username for website "+fetch+" is: "+st1);
			    	System.out.println("Your password for website "+fetch+" is: "+st2);
			    	f=1;
			    }
			    if(f==0)
			    {
			    	System.out.println("Credentials Not Stored");
			    }
		}
		    	
	   }
		public void deleteFile(String unn)
		{
		 	unn=unn+".txt";
			 File myFile = new File(unn);
		        if(myFile.delete()){
		            System.out.println("File deleted: " + unn);
		        }
		        else{
		            System.out.println("File not found");
		        }
		}
	}