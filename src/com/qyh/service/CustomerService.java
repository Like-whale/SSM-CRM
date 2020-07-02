package com.qyh.service;

import com.qyh.pojo.BaseDict;
import com.qyh.pojo.Customer;
import com.qyh.pojo.QueryVo;

import java.util.List;

public interface CustomerService {

    public List<BaseDict> findDictByCode(String code);

    public List<Customer> findCustomerByVo(QueryVo vo);
    public Integer findCustomerByVoCount(QueryVo vo);

    public Customer findCustomerById(Long id);

    public void updateCustomerById(Customer customer);

    public void delCustomerById(Long id);

    public int insertCustomer(Customer customer);

}
