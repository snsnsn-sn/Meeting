package DAO;

import VO.PickUser;

import java.util.List;

public interface PickUserRespository {
    //查全部
    public List<PickUser> findAll(int currentPage, int pageSize);
    //查看全部记录，显示所有司机接送信息
    public List<PickUser> findAll();
    //接送完之后就根据用户 id 删除记录
    public void deleteByUserId(String userId);
    //根据司机删除
    public void deleteByDriverId(String driverId);
    //插入接送信息
    public void insert(String userId,String driverId);
    //查总记录数
    public int count();
}
