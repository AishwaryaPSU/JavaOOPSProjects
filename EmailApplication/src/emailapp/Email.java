package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLEngth =10;
    private String email;
    private String altEmail;
    private String companySuffix ="aeycompany.com";

    //Constructor to receive firstname and the lastname
    public Email(String fname,String lname){
        this.firstName = fname;
        this.lastName = lname;
        //System.out.println(String.format("Email Created: %s %s",firstName,lastName));

        //call a method asking for the department - which will return the department
        this.department=setDepartment();
        //System.out.println(String.format("%s %s belongs to %s department.",firstName,lastName,department));

        //call a method that returns a random password
        this.password=randomPassword(defaultPasswordLEngth);
        //System.out.println("Your password is "+this.password);

        //combine elements to generate email
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companySuffix;
        //System.out.println(String.format("Email for %s %s is %s",firstName,lastName,email));
    }

    //ask for the department
    private String setDepartment(){
        System.out.println("Enter the department the person belongs to.\nDepartment codes are: \n1.Sales\n2.Development\n3.Accounting\n0.None");
        Scanner inputDept = new Scanner(System.in);
        int input = inputDept.nextInt();
        if(input == 1){
            return "Sales";
        }
        if(input == 2){
            return "Development";
        }
        if(input == 3){
            return "Accounting";
        }
        if(input==0)
            return "";
        return "";
    }

    //generate a random password
    private String randomPassword(int length){
        String passwordSet ="ABCDEFGHIJKLMNOPQRSTVUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }


    // set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity=capacity;
    }

    // set the alternate email
    public void setAltEmail(String altEmail){
        this.altEmail=altEmail;
    }

    // change the password
    public void changePassword(String newPassword){
        this.password=newPassword;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getEmail(){
        return email;
    }

    public String getAltEmail(){
        return altEmail;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String showInfo(){
        String display = "Name: "+getFirstName()+" "+getLastName()+"\nEmail: "+getEmail()+"\nMail Box Capacity:"+getMailBoxCapacity();
        return display;
    }

}
