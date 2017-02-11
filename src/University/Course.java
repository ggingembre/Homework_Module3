package University; /**
 * Created by Guillaume Gingembre on 07/02/2017.
 */

import java.util.Calendar;

public class Course {

    // the University.Course class has
    // four fields
    private Calendar startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    // the course class has
    // two constructors

    public Course (Calendar startDate, String name) {
        this.startDate = startDate;
        this.name = name;
    }

    public Course (int hoursDuration, String name, String teacherName) {
        this.hoursDuration = hoursDuration;
        this.name = name;
        this.teacherName = teacherName;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return name;
    }
}
