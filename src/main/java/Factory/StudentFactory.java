package Factory;

public class StudentFactory {
    enum studentType{
        GRADESCHOOL, HIGHSCHOOL, COLLEGE
    }

    static StudentFactory createStudent(studentType student) throws Exception{

        switch(student) {
            case GRADESCHOOL:
                return new GradeSchool();

            case HIGHSCHOOL:
                return new HighSchool();

            case COLLEGE:
                return new College();

            default:
                throw new Exception("This student type is not yet supported");
        }
    }

    void showme(){

    }
}
