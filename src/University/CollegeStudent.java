package University;

/**
 * Created by Guillaume Gingembre on 07/02/2017.
 */
public class CollegeStudent extends Student {

    // declaring variables

    private String collegeName;
    private int rating;
    private long id;

    // three constructors

    public CollegeStudent (String firstName, String lastName, int group){super(firstName,lastName, group);}

    public CollegeStudent (String lastName, Course[] coursesTaken){super(lastName, coursesTaken);}

    public CollegeStudent (String firstName, String lastName, int group, Course[] coursesTaken, int age,
                           String collegeName, int rating, long id){
       this(firstName, lastName, group);
       setCoursesTaken(coursesTaken);
       setAge(age);
       this.collegeName = collegeName;
       this.rating = rating;
       this.id = id;
    }

    // get and set methods

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

    // Дополнительные поля: String collegeName, int rating, long id.
     //    Создайте 3 конструктора: 2 таких же, как и в University.Student and один с аргументами - всеми полями класса.