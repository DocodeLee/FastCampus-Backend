package pet.mvc;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private List<Customer> customers;
    private MedicalRecordController recordController;

    // customerController must be connected with medicalRecordController
    public CustomerController(MedicalRecordController recordController){
        this.customers = new ArrayList<>();
        this.recordController=recordController;
    }
    // register customer info
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    //remove customer infos with records
    public void removeCustomer(String phoneNumber){
        for(int i =0; i < customers.size();i++){
            if(customers.get(i).getPhoneNumber().equals(phoneNumber)){
                customers.remove(i);
                recordController.removeMedicalRecord(phoneNumber); //delete records
                break;
            }
        }
    }

    //check for registeration
    public Customer findCustomer(String phoneNumber){
        for(Customer customer: customers){
            if(customer.getPhoneNumber().equals(phoneNumber)){
                return customer;
            }
        }
        return null;
    }
    //check duplicate
    public boolean isPhoneNumberExist(String phoneNumber){
        for(Customer customer : customers){
            if(customer.getPhoneNumber().equals(phoneNumber)){
                return true;
            }
        }
        return false;
    }


}
