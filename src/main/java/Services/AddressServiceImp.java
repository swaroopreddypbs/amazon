package Services;

import Models.Address;
import Repository.AddressReppo;
import dtos.OnlyAddress;

import java.util.List;

public class AddressServiceImp implements AddressService{
    AddressReppo addressReppo=new AddressReppo();

    @Override
    public void CreateDetails(Address address ,Long id) {
        addressReppo.CreateDetails(address,id);

    }

    @Override
    public Address getDetailsById(Long id) {
        Address detailsById = addressReppo.getDetailsById(id);
        return detailsById;
    }

    @Override
    public void updateById(Long id, String email) {
        addressReppo.updateDetailsById(id,email);

    }

    @Override
    public List<Address> findAll() {
        List<Address> all = addressReppo.findAll();
        return all;
    }

    @Override
    public List<OnlyAddress> findAllAddress() {
        List<OnlyAddress> allAddress = addressReppo.findAllAddress();
        return allAddress;
    }
}
