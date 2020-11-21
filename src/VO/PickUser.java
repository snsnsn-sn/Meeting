package VO;

public class PickUser {
    private String userId;
    private String driverId;

    public PickUser(String userId, String driverId) {
        this.userId = userId;
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "PickUser{" +
                "userId='" + userId + '\'' +
                ", driverId='" + driverId + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

}
