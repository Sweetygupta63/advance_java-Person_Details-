package dto;

public class Person {
    private int id;
    private String name;
    private int age;
    private String address;
    private String email;
    private long phone;

    //getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }
    public long getPhone() {
        return phone;
    }

    //setters

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
}
