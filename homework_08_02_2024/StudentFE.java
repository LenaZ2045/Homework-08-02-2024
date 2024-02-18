package com.proftelran.org.lesson34.homework_08_02_2024;

//В данном классе должно быть получено только поле surname
//префикс FE
public class StudentFE extends AbstractStudent {

    private final String name;

    @StudentInfo(prefix = "FE: ")
    private final String surname;

    public StudentFE() {
        name = NameUtil.getRandomName();
        surname = NameUtil.getRandomName();
    }
}