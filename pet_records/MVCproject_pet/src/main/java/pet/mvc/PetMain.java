package pet.mvc;

import java.util.List;
import java.util.Scanner;

public class PetMain {
    public static void main(String[] args) {
        MedicalRecordController recordController = new MedicalRecordController();
        CustomerController customerController = new CustomerController(recordController);
        ConsoleView view = new ConsoleView();

        while(true){
            System.out.println("==Pet Medical Record==");
            System.out.println("1. New Customer");
            System.out.println("2. Save Records");
            System.out.println("3. Find Records");
            System.out.println("4. Remove Records");
            System.out.println("5. EXIT");
            System.out.println("Please Type Number You Want");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    Customer newCustomer = view.getCustomerInfo();
                    String phoneNumber = newCustomer.getPhoneNumber();
                    if(customerController.isPhoneNumberExist(phoneNumber)){
                        view.printMessage("Already Registered");
                        continue;
                    }
                    customerController.addCustomer(newCustomer);
                    view.printMessage("Customer info added");
                    break;

                case 2:
                    phoneNumber = view.getPhoneNumber();
                    if(customerController.findCustomer(phoneNumber) == null){
                        view.printMessage("We Don't have that PN");
                        break;
                    }
                    Customer customer = customerController.findCustomer(phoneNumber);
                    MedicalRecord newRecord = view.getMedicalRecordInfo();
                    newRecord.setPhoneNumber(phoneNumber);
                    recordController.addMedicalRecord(newRecord);
                    customer.addMedicalRecords(newRecord);
                    view.printMessage("Saved data");
                    break;
                case 3:
                    phoneNumber = view.getPhoneNumber();
                    List<MedicalRecord> records = recordController.findMedicalRecords(phoneNumber);
                    if(records.isEmpty()){
                        view.printMessage("We Don't Have Records For That PN");
                        break;
                    }
                    customer = customerController.findCustomer(phoneNumber);
                    view.printMedicalRecordInfo(customer);
                    break;
                case 4:
                    phoneNumber = view.getPhoneNumber();
                    if(customerController.findCustomer(phoneNumber) == null){
                        view.printMessage("No Customer For That PN");
                        break;
                    }
            }
        }

    }
}
