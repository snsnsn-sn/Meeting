package VO;

public class Driver {
    private String driverId;//司机账号
    private String password;//司机密码
    private String phone;//司机电话
    int passengers;//最大载客数
    int state;//司机状态，0表示空闲，1表示忙碌

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Driver(String driverId, String password, String phone, int passengers, int state) {
        this.driverId = driverId;
        this.password = password;
        this.phone = phone;
        this.passengers = passengers;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId='" + driverId + '\'' +
                ", password='" + password + '\'' +
                ",phone='" + phone + '\'' +
                ",passengers='" + passengers + '\'' +
                ",state='" + state + '\'' +
                '}';
    }
}
