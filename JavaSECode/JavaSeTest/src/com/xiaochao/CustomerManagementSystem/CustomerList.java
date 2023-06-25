package com.xiaochao.CustomerManagementSystem;

public class CustomerList {
    private Customer[] customers;//用来保存客户对象的数组
    private int total = 0;//记录已保存客户对象的数量
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /*
    *用途：将参数customer添加组中最后一个客户对象记录之后
    * 参数：customer指定要添加的客户对象
    * 返回：添加成功后返回true；false表示数组已满，无法添加
    *
     */
    public boolean addCustomer(Customer customer){
            if(total<customers.length){
                customers[total] = customer;
                total++;
                return true;
            }

            return false;
    }

    public boolean replaceCustomer(int index,Customer cust){
            if(index>=0&&index<total){
                customers[index] = cust;
                return true;
            }
            return false;
    }

    public boolean deleteCustomer(int index){
        if(index<0||index>=total){
            return false;
        }
        for (int i = index; i <total-1 ; i++) {
            customers[i] = customers[i+1];
        }
        //将有效数组最后一个数据置空
        customers[--total] = null;
        return true;
    }
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    //返回参数index所指定的索引位置的对象信息
    public Customer getCustomer(int index){
        if(index<0||index>=total){
            return null;
        }else {
            return customers[index];
        }
    }

    //获取客户列表中客户的数量
    public int getTotal(){
        return total;
    }
}
