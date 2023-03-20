package task_1;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    int id;


    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public String getName(){
        return (firstName + " " + lastName);
    }

    public String getUserName(){
        return userName;
    }


    public String toString (){
        return getName() + " : " + getUserName();
    }
}
