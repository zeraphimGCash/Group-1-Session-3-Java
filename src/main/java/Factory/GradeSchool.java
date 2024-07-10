package Factory;

class GradeSchool extends StudentFactory{

    static int studentid = 2024000;
    String gschoolId;

    public GradeSchool(){
        studentid++;
        this.gschoolId = Integer.toString(studentid) + "G";
    }
    protected void showme()
    {
        System.out.println("GradeSchool ID: " + this.gschoolId);
    }
}

class HighSchool extends StudentFactory{

    static int studentid = 2024000;
    String hschoolId;

    public HighSchool(){
        studentid++;
        this.hschoolId = Integer.toString(studentid) + "H";
    }

    protected void showme()
    {
        System.out.println("GradeSchool ID: " + this.hschoolId );
    }
}

class College extends StudentFactory{

    static int studentid = 2024000;
    String cschoolId;

    public College(){
        studentid++;
        this.cschoolId = Integer.toString(studentid) + "C";
    }

    protected void showme()
    {
        System.out.println("GradeSchool ID: " + this.cschoolId);
    }
}
