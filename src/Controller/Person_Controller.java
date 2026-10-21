package Controller;

import dto.Person;
import service.PersonService;

import java.util.List;
import java.util.Scanner;

public class Person_Controller {

    static void main() {
        Person person=new Person();
        PersonService personService=new PersonService();
        Scanner sc=new Scanner(System.in);
        System.out.println("=".repeat(20)+"Welcome to jdbc_project"+"=".repeat(20));
        System.out.println("1: Insert Person details");
        System.out.println("2 : Update details");
        System.out.println("3 : Delete person");
        System.out.println("4 : Get Persons");
        System.out.println("5 : Exit");
        int option =sc.nextInt();
        switch (option){
            case 1: {
                System.out.println("Enter id : ");
                person.setId(sc.nextInt());
                System.out.println("Enter name : ");
                sc.nextLine();
                person.setName(sc.nextLine());
                System.out.println("Enter age : ");
                person.setAge(sc.nextInt());
                System.out.println("Enter address : ");
                sc.nextLine();
                person.setAddress(sc.nextLine());
                System.out.println("Enter email : ");
                person.setEmail(sc.nextLine());
                System.out.println("enter phone number : ");
                person.setPhone(sc.nextLong());
                personService.insertPerson(person);
            } break;

            case 2: {
                System.out.println("Enter id : ");
                int id = sc.nextInt();
                System.out.println("Enter name : ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter age : ");
                int age = sc.nextInt();
                personService.updatePerson(id, name, age);
            }break;
            case 3: {
                System.out.println("Enter id : ");
                int pid = sc.nextInt();
                personService.deletePerson(pid);
            }break;
            case 4: {
                List<Person> list = personService.getPersons();
                for ( Person person1:
                        list) {
                    System.out.println("Id is : " + person1.getId());
                    System.out.println("Name is : " + person1.getName());
                    System.out.println("Age is : " + person1.getAge());
                    System.out.println("Address is : " + person1.getAddress());
                    System.out.println("Email is : " + person1.getEmail());
                    System.out.println("Phone number is : " + person1.getPhone());
                }
            }break;
            case 5: {
                System.exit(0);
            }break;
        }
    }
}
