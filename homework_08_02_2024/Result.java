package com.proftelran.org.lesson34.homework_08_02_2024;

//В данном классе должен быть вызван метод printStudentsInfo
public class Result extends AbstractStudent {

    public Result() {
        //
    }

    @StudentInfo(prefix = "Result: ")
    void printStudentsInfo(String info) {
        System.out.println(info);
    }
}