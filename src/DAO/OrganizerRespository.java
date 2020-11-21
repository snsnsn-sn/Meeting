package DAO;

public interface OrganizerRespository {
    //插入
    public void insert(String userId,String password);
    //验证
    public boolean check(String userId,String password);
}
