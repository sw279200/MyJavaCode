package com.xiaochao.object.equals.Test02;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackage: com.xiaochao.object.equals.Test02
 * @Author: 锦猪好有味
 * @CreateTime: 2023-06-29  18:54
 * @Description: equals方法的应用
 * @Version: 1.0
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj instanceof MyDate){
            MyDate md = (MyDate)obj;
            return md.day==this.day && this.month == md.month && this.year == md.year;
        }

        return false;
    }
}
