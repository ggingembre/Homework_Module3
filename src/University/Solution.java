package University; /**
 * Created by Guillaume Gingembre on 08/02/2017.
 */
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {

        Calendar startOfCourse = new GregorianCalendar(2017,01,15);

        // create 5 course objects

                Course java6 = new Course(startOfCourse, "Java6");
                Course softSkills = new Course (100, "Soft Skills", "Joe");
                Course english = new Course (startOfCourse,"English");
                Course webDesign = new Course (300, "Web Design", "Anna");
                Course career = new Course (startOfCourse,"Career Centre");

        // Create arrays of courses (programs)

        Course [] javaProgramPlus = {java6, english, softSkills,career};
        Course [] webProgram = {webDesign, english, softSkills};
        Course [] webProgramPlus = {webDesign, english, softSkills,career};
        Course [] allProgram = {java6,webDesign,english,softSkills};
        Course [] allProgramPlus = {java6,webDesign,english,softSkills,career};


        // create students using two student-class constructors:

            Student gGingembre = new Student("Guillaume", "Gingembre", 6) ;
            Student eIzotova = new Student ("Izotova",webProgram);

        // create students using three collegestudent-class constructors:

            CollegeStudent cGalant = new CollegeStudent("Charles", "Galant", 5);
            CollegeStudent xGalant = new CollegeStudent("Galant",webProgramPlus);
            CollegeStudent nKuz = new CollegeStudent ("Natasha", "Kuznietsova", 4, allProgramPlus, 20,
        "GoIT College", 100, 012345);

        // create students using University.SpecialStudent-class constructors:
        CollegeStudent jDrean = new SpecialStudent("Jean", "Drean", 3);
        CollegeStudent lDrean = new SpecialStudent("Drean",allProgram);
        CollegeStudent maryna = new SpecialStudent(12345);

        // assign programs to two students, to see what happens
            jDrean.setCoursesTaken(new Course [] {java6,english,softSkills});
            cGalant.setCoursesTaken(javaProgramPlus);
            gGingembre.setCoursesTaken(allProgramPlus);

            maryna.setFirstName("Maryna");

        // print out the 8 students in this solution class

        System.out.println(gGingembre.toString());
        System.out.println(eIzotova.toString());
        System.out.println(cGalant.toString());
        System.out.println(xGalant.toString());
        System.out.println(nKuz.toString());
        System.out.println(jDrean.toString());
        System.out.println(lDrean.toString());
        System.out.println(maryna.toString());

    }
}
