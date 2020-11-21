package DAO;

import VO.OrderHotel;

import java.util.List;

public interface OrderHotelRespository {
    //查全部
    public List<OrderHotel> findAll(int currentPage, int pageSize);
    //查全部
    public List<OrderHotel> findAll();
    //查，根据用户 id 查，分页
    public List<OrderHotel> findByUserId(String userId,int currentPage,int pageSize);
    //查，根据用户 id 查
    public List<OrderHotel> findByUserId(String userId);

    //增
    public void insert(String userId, int people, int state);

    //根据用户 id 删
    public void deleteByUserId(String userId);

    //改,根据用户 id 改
    public void update(String userId, String userId1, int people, int state);


    //查总记录数
    public int count();
    //查 userId 的总记录数
    public int count(String userId);
}
