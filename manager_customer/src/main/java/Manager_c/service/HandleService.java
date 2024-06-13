package Manager_c.service;

import Manager_c.entity.Customer;

import java.util.List;

public interface HandleService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
    void delete(int id);
    void update(int id,Customer customer);
}
