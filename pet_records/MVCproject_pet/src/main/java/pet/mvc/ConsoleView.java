package pet.mvc;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);
    //get PN
    public String getPhoneNumber(){
        System.out.println("Insert PN : ");
        return scanner.nextLine();
    }

    //new Customer
    public Customer getCustomerInfo(){
        System.out.println("Insert New Customer Info");
        System.out.println("Phone Number : ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Owner Name : ");
        String ownerName= scanner.nextLine();
        System.out.println("Pet Name : ");
        String petName = scanner.nextLine();
        System.out.println("Address : ");
        String address = scanner.nextLine();
        System.out.println("Species : ");
        String species = scanner.nextLine();
        System.out.println("birthyear(yyyy) : ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();
        return new Customer(phoneNumber, ownerName, petName,address, species, birthYear);
    }

    // display for records
    public MedicalRecord getMedicalRecordInfo(){
        System.out.println("Please insert date : ");
        String date = scanner.nextLine();

        System.out.println("Please insert record : ");
        String content = scanner.nextLine();

        return new MedicalRecord(null,date,content);
    }
    // find record print

    public void printMedicalRecordInfo(Customer customer){
        List<MedicalRecord> records = customer.getMedicalRecords();
        System.out.println("[" + customer.getPetName() + "] records");
        for(MedicalRecord record : records){
            System.out.println("date" + record.getDate());
            System.out.println("content" + record.getContent());
            System.out.println("Owner" + customer.getOwnerName());
            System.out.println("Pet Name" + customer.getPetName());
            System.out.println("Address" + customer.getAddress());
            System.out.println("Species" + customer.getSpecies());
            System.out.println("Birth Year" + customer.getBirthYear());
        }
    }
    public void printMessage(String message){
        System.out.println(message);
    }

}
