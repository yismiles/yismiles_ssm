package cn.yismiles.ssm.service;


import cn.yismiles.ssm.pojo.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}
