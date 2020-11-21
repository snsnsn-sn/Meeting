package VO;

public class Meeting {
    private String meetingId;//会议号
    private String userId;//创建会议的用户账号
    private String place;//会议地点
    private Integer peopleCount;//会议参与人数
    private String time;//会议开始时间，记得使用DBDate类里的方法

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Meeting(String meetingId, String userId, String place, Integer peopleCount, String time) {
        this.meetingId = meetingId;
        this.userId = userId;
        this.place = place;
        this.peopleCount = peopleCount;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "meetingId='" + meetingId + '\'' +
                ", userId='" + userId + '\'' +
                ", place='" + place + '\'' +
                ", peopleCount=" + peopleCount +
                ", time='" + time + '\'' +
                '}';
    }
}
