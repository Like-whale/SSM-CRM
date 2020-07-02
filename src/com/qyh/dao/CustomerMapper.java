package com.qyh.dao;

import com.qyh.pojo.Customer;
import com.qyh.pojo.QueryVo;

import java.util.List;

public interface CustomerMapper {

    public List<Customer> findCustomerByVo(QueryVo vo);
    public Integer findCustomerByVoCount(QueryVo vo);

    public Customer findCustomerById(Long id);

    public void updateCustomerById(Customer customer);

    public void delCustomerById(Long id);

    public int insertCustomer(Customer customer);

}
