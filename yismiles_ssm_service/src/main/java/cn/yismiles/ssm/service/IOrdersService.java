package cn.yismiles.ssm.service;


import cn.yismiles.ssm.pojo.Orders;

import java.util.List;

public interface IOrdersService {


    List<Orders> findAll(int page, int size) throws Exception;
}
