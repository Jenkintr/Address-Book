/*
 * 
 */
package addressbook;

/**
 *
 * @author Taylor Jenkins
 */
public class Contact {
    
        private String phoneNumber;
        private String fName;
        private String lName;
        private String address;
        private String emailAddress;
    
    public Contact(String phoneNum, String fname, String lname, String addr, 
            String Email){
        this.phoneNumber = phoneNum;
        this.fName = fname;
        this.lName = lname;
        this.address = addr;
        this.emailAddress = Email;
    }
    
    //Setters
    public void setAddress(String address){
        this.address = address;
    }
    
    //Getters
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    
    public String getFname(){
        return this.fName;
    }
    
    public String getLname(){
        return this.lName;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public String getEmail(){
        return this.emailAddress;
    }

}  
