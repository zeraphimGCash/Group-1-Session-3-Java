package Factory;


class Main
{
    public static void main(String[] args)
    {
        try{
            StudentFactory s1 = StudentFactory.createStudent(StudentFactory.studentType.GRADESCHOOL);
            s1.showme();
            StudentFactory s2 = StudentFactory.createStudent(StudentFactory.studentType.HIGHSCHOOL);
            s2.showme();
            StudentFactory s3 = StudentFactory.createStudent(StudentFactory.studentType.COLLEGE);
            s3.showme();
            StudentFactory s4 = StudentFactory.createStudent(StudentFactory.studentType.GRADESCHOOL);
            s4.showme();
            StudentFactory s5 = StudentFactory.createStudent(StudentFactory.studentType.COLLEGE);
            s5.showme();
            StudentFactory s6 = StudentFactory.createStudent(StudentFactory.studentType.GRADESCHOOL);
            s6.showme();
            StudentFactory s7 = StudentFactory.createStudent(StudentFactory.studentType.HIGHSCHOOL);
            s7.showme();
            StudentFactory s8 = StudentFactory.createStudent(StudentFactory.studentType.COLLEGE);
            s8.showme();
            StudentFactory s9 = StudentFactory.createStudent(StudentFactory.studentType.GRADESCHOOL);
            s9.showme();
            StudentFactory s10 = StudentFactory.createStudent(StudentFactory.studentType.COLLEGE);
            s10.showme();
        }
        catch(Exception e){
        }
    }
}