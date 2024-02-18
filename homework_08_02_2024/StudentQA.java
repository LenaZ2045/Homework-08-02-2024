package com.proftelran.org.lesson34.homework_08_02_2024;

//В данном классе должно быть получено только поле number
//префикс QA
public class StudentQA extends AbstractStudent {

    private final String name;

    private final String surname;

    @StudentInfo(prefix = "QA: ")
    private String number;

    public StudentQA() {
        name = NameUtil.getRandomName();
        surname = NameUtil.getRandomName();
        number = NameUtil.getRandomNumber();
    }
}