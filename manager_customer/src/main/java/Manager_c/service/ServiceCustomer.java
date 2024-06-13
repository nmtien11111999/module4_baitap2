package Manager_c.service;

import Manager_c.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCustomer implements HandleService{
    private static List<Customer> customers = new ArrayList<Customer>();
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void delete(int id) {
        customers.removeIf(customer -> customer.getId() == id);
    }

    @Override
    public void update(int id, Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id) {
                customers.set(i, customer);
                return;
            }
        }
    }
}
