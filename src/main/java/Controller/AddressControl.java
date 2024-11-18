package Controller;

import Models.Address;
import Models.Customer;
import Services.AddressService;
import Services.AddressServiceImp;
import Services.CustomerService;
import Services.CustomerServiceImp;
import dtos.OnlyAddress;

import java.util.List;

public class AddressControl {
    public static void main(String[] args) {
        AddressService addressService=new AddressServiceImp();
        Long id=1L;
        Long id1=2L;
        Long id2=3L;
//        Address address=new Address("maruthi","ap","india");
//        addressService.CreateDetails(address,id);
//        Address address1=new Address("yerramukkapalli","ap","india");
//        addressService.CreateDetails(address1,id1);
//        Address address2=new Address("padmavathi","ap","india");
//        addressService.CreateDetails(address2,id2);
////        Long id=501L;
//        String email="mandapalliswaroopreddy@gmail.com";
//
//        Address detailsById = addressService.getDetailsById(id);
//        System.out.println(detailsById);
//        Customer customer = detailsById.getCustomer();
//        System.out.println(customer);
//        addressService.updateById(id,email);
//        List<Address> all = addressService.findAll();
//        System.out.println(all );
//        List<OnlyAddress> allAddress = addressService.findAllAddress();
//        System.out.println(allAddress);
    }




}
