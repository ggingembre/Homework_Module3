package University;

/**
 * Created by Guillaume Gingembre on 08/02/2017.
 */
public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    public SpecialStudent (String firstName, String lastName, int group){super(firstName, lastName, group);}

    public SpecialStudent (String lastName, Course[] coursesTaken){super(lastName, coursesTaken);}

    public SpecialStudent (String firstName, String lastName, int group, long secretKey){
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

    // Class University.SpecialStudent унаследован от University.CollegeStudent.
      //  Дополнительные поля long secretKey, String email.
      //  Создайте 3 конструктора: 2 таких же, как и в University.CollegeStudent и один с аргументом secretKey.