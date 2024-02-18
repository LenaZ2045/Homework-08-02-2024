package com.proftelran.org.lesson34.homework_08_02_2024;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface StudentInfo {
    String prefix();
}