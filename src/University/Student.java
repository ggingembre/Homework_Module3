package University;

/**
 * Created by Guillaume Gingembre on 07/02/2017.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

    // constructors

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    // get and set methods

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        if (firstName == null) return "";
        return firstName;
    }

    public int getGroup() {
        return group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public StringBuilder returnCoursesTaken(Course[] coursesTaken){
        StringBuilder stringcourses = new StringBuilder();
        if (coursesTaken != null) {
            for (int i = 0; i < coursesTaken.length; i++) {
                if (i > 0) {stringcourses.append(", ");}
                stringcourses.append(coursesTaken[i]);
            }
        }
        return stringcourses;
    }

    @Override // in order to properly print the objects
    public String toString() {
        return "Name: " + ((firstName == null)? "" : firstName) + " " +((lastName == null)? "" :  lastName) +
                "\nGroup: " + ((group == 0)? "" : group) + "\nCourses taken: " + returnCoursesTaken(coursesTaken);
    }

}

