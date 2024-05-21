package lk.ijse.gdse65.shoe_shop.util;

import lk.ijse.gdse65.shoe_shop.dto.*;
import lk.ijse.gdse65.shoe_shop.entity.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class Mapping {
    @Autowired
    private ModelMapper modelMapper;


    //    Customer
    public Customer toCustomer(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, Customer.class);

    }

    public CustomerDTO toCustomerDTO(Customer customer) {
        return modelMapper.map(customer, CustomerDTO.class);

    }

    public List<Customer> toCustomerList(List<CustomerDTO> customerDTOList) {
        return modelMapper.map(customerDTOList, new TypeToken<ArrayList<Customer>>() {}.getType());

    }

    public List<CustomerDTO> toCustomerDTOList(List<Customer> customerList) {
        return modelMapper.map(customerList, new TypeToken<ArrayList<CustomerDTO>>() {}.getType());

    }

    //    Employee
    public Employee toEmployee(EmployeeDTO employeeDTO) {
        return modelMapper.map(employeeDTO, Employee.class);

    }

    public EmployeeDTO toEmployeeDTO(Employee employee) {
        return modelMapper.map(employee, EmployeeDTO.class);

    }
    public Employee toEmployeeEntity(EmployeeDTO employeeDTO){return modelMapper.map(employeeDTO, Employee.class);}


    public List<EmployeeDTO> toEmployeeDTOList(List<Employee> employeeList) {
        return modelMapper.map(employeeList, new TypeToken<ArrayList<EmployeeDTO>>() {}.getType());

    }

    //    Supplier
    public Supplier toSupplier(SupplierDTO supplierDTO) {
        return modelMapper.map(supplierDTO, Supplier.class);

    }

    public SupplierDTO toSupplierDTO(Supplier supplier) {
        return modelMapper.map(supplier, SupplierDTO.class);

    }

    public List<Supplier> toSupplierList(List<SupplierDTO> supplierDTOList) {
        return modelMapper.map(supplierDTOList, new TypeToken<ArrayList<Supplier>>() {}.getType());

    }

    public List<SupplierDTO> toSupplierDTOList(List<Supplier> supplierList) {
        return modelMapper.map(supplierList, new TypeToken<ArrayList<SupplierDTO>>() {}.getType());

    }
    public List<SupplierDTO> getSupplierDTOList(List<Supplier> supplierEntities){return modelMapper.map(supplierEntities, List.class);}

    //String to date
    public static Date convertToDate(String date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date updatedDate = null;
        try {
            updatedDate = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return updatedDate;
    }
    //Item Mapping
    public ItemDTO toItemDTO(Item item){
        return modelMapper.map(item, ItemDTO.class);
    }
    public Item toItemEntity(ItemDTO itemDTO){
        return modelMapper.map(itemDTO, Item.class);
    }
    public List<ItemDTO> getItemDTOList(List<Item> itemEntities){
        return modelMapper.map(itemEntities, List.class);
    }

    //Item Image Mapping
    public ItemImageDTO toItemImageDTO(ItemImage itemImage){
        return modelMapper.map(itemImage, ItemImageDTO.class);
    }
    public ItemImage toItemImageEntity(ItemImageDTO itemImageDTO){return modelMapper.map(itemImageDTO, ItemImage.class);}
    public List<ItemImageDTO> getItemImageDTOList(List<ItemImage> itemImageEntities){return modelMapper.map(itemImageEntities, List.class);}
    //Alert Mapping
    public AlertDTO toAlertDTO(Alert alert){
        return modelMapper.map(alert, AlertDTO.class);
    }
    public Alert toAlertEntity(AlertDTO alertDTO){
        return modelMapper.map(alertDTO, Alert.class);
    }
    public List<AlertDTO> getAlertDTOList(List<Alert> alertEntities){return modelMapper.map(alertEntities, List.class);}
}
