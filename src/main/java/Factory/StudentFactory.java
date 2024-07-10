package com.designpatterns.FactoryExample;

public class StudentFactory {
    enum studentType{
        GRADESCHOOL, HIGHSCHOOL, COLLEGE;
    }

    static StudentFactory createStudent(studentType student) throws Exception{

        switch(student) {
            case GRADESCHOOL:
                return new GradeSchool();

            case HIGHSCHOOL:
                return new HighSchool();

            case COLLEGE:
                return new College();
        }

    }

    void showme(){

    }
}
