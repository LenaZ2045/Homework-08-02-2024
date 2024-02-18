package com.proftelran.org.lesson34.homework_08_02_2024;

//В данном классе должно быть получено только поле name
//префикс BE

public class StudentBE extends AbstractStudent {

    @StudentInfo(prefix = "BE: ")
    private final String name;

    private final String surname;

    public StudentBE() {
        name = NameUtil.getRandomName();
        surname = NameUtil.getRandomName();
    }
}