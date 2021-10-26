package com.company;

public class UserRegistration {
   private String name ;
   private String Email;
   private int contactNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public UserRegistration(String name, String email, int contactNumber) {
        this.name = name;
        Email = email;
        this.contactNumber = contactNumber;
    }

    public String userRegistration(){
        String str = "userdata"+ name+Email+contactNumber;
        return str;
    }

}
