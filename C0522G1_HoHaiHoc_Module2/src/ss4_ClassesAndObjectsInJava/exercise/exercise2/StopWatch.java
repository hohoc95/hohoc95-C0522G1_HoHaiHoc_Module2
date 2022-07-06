package ss4_ClassesAndObjectsInJava.exercise.exercise2;

import java.util.Date;

public class StopWatch {

    //Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.
    private Date startTime, endTime;

    StopWatch() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }

}