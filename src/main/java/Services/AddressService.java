package Services;

import Models.Address;
import dtos.OnlyAddress;

import java.util.List;

public interface AddressService {
    void CreateDetails(Address address,Long id);
    Address getDetailsById(Long id);
    void updateById(Long id,String email);
    List<Address> findAll();
    List<OnlyAddress> findAllAddress();
}
