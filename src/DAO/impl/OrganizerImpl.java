package DAO.impl;

import DAO.DBConnection.DBConn;
import DAO.OrganizerRespository;
import VO.OrderHotel;
import VO.Organizer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrganizerImpl implements OrganizerRespository {
    Connection conn = null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    OrderHotel oh = null;
    @Override
    public void insert(String userId, String password) {
        String sql="insert into organizer values (?,?)";
        try {
            conn = DBConn.getConnection();
            pre = conn.prepareStatement(sql);
            pre.setString(1,userId);
            pre.setString(2,password);
            pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            DBConn.close();
        }
    }

    @Override
    public boolean check(String userId, String password) {
        boolean flag = false;
        String sql = "select * from organizer where userId = ?";
        try {
            conn = DBConn.getConnection();
            pre = conn.prepareStatement(sql);
            pre.setString(1,userId);
            rs = pre.executeQuery();
            while(rs.next()){
                String password1 = rs.getString(2);
                if(password.equals(password1))
                    flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConn.close();
        }
        return flag;
    }
}
