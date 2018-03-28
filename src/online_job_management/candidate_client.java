package online_job_management;

import java.util.Scanner;

import java.util.Random;

import javax.swing.JOptionPane;

public class candidate_client {
	
	static int counter=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
        name = JOptionPane.showInputDialog("Enter your Name");
        
    	String firstNumber = JOptionPane.showInputDialog("Mobile Number <max. 9 digits only>");
        int num1 = Integer.parseInt(firstNumber);
        
        String email;
        email = JOptionPane.showInputDialog("Enter your Email");
        
        String address;
        address = JOptionPane.showInputDialog("Enter your Address");
        
        String education;
        education = JOptionPane.showInputDialog("Enter your qualification details");
        
        candidate c1=new candidate(name,num1,email,address,education);
        
        System.out.println("- - - Candidate Details - - -");
        System.out.println("Name :" +c1.getName());
        System.out.println("Mobile :" +c1.getMobile());
        System.out.println("Email :" +c1.getEmail());
        System.out.println("Address :" +c1.getAddress());
        System.out.println("Education :" +c1.getEducation());
        
        Random rnum = new Random();
        System.out.println("Registration number :");
        for (counter = 0; counter <= 0; counter++) {
            System.out.println(rnum.nextInt(200));
         }
        
      //candidate confirmation
        c1.email();
        c1.mobile();
	}

}
