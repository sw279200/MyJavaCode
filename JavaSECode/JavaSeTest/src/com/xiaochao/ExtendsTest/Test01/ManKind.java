package com.xiaochao.ExtendsTest.Test01;

public class ManKind {
    private int sex;
    private int salary;

    public ManKind() {
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if(sex==1){
            System.out.println("Man");
        }else if(sex==0){
            System.out.println("Woman");
        }
    }
    public void employeed(){
        if(salary == 0){
            System.out.println("no job!");
        }else{
            System.out.println("job");
        }
    }
}
