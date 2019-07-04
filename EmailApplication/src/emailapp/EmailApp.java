package emailapp;

public class EmailApp {
    public static void main(String[] args){
        Email email1 = new Email("John","Smith");
        //email1.changePassword("HiThere!!");
        //email1.setMailBoxCapacity(10);
        //email1.setAltEmail("smith.john@dev.com");
        System.out.println("Person Details are as follows:\n");
        // System.out.println(String.format("Name :%s %s\n",email1.getFirstName(),email1.getLastName()));
//        System.out.println("Email address is: "+email1.getEmail());
//        System.out.println("Alternate email address is: "+email1.getAltEmail());
//        System.out.println("Mailbox capacity is: "+email1.getMailBoxCapacity());
        System.out.println(email1.showInfo());
    }
}
