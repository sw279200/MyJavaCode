package com.xiaochao.CustomerManagementSystem;

public class CustomerView {
    private CustomerList customers = new CustomerList(10);

    public CustomerView() {
        Customer cust = new Customer("张三", '男', 30, "010-56253825",
                "abc@email.com");
        customers.addCustomer(cust);
    }
    //进入主菜单的方法
    public void enterMainMenu(){
        boolean isFlag = true;
        while(isFlag){
            System.out
                    .println("\n--------------------拼电商客户管理系统--------------------\n");
            System.out.println("                    1 添 加 客 户");
            System.out.println("                    2 修 改 客 户");
            System.out.println("                    3 删 除 客 户");
            System.out.println("                    4 客 户 列 表");
            System.out.println("                    5 退      出\n");
            System.out.print("                    请选择(1-5): ");

            char key = CMUtility.readMenuSelection();

            //获取用户选择

            switch(key){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.println("确认是否退出(Y/N):");
                    char isExit = CMUtility.readConfirmSelection();
                    if(isExit=='Y') {
                        isFlag = false;
                    }
                    break;
            }
        }
    }
    private void addNewCustomer(){
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(15);
        System.out.print("邮箱：");
        String email = CMUtility.readString(15);
        Customer custs = new Customer(name,gender,age,phone,email);
        boolean flag = customers.addCustomer(custs);
        if(flag){
            System.out.println("---------------------添加完成---------------------");
        }else{
            System.out.println("----------------记录已满,无法添加-----------------");
        }

    }
    private void modifyCustomer(){
            System.out.println("---------------------修改客户---------------------");

            int index = 0;
            Customer c1 = null;
            for (;;) {
                System.out.print("请选择待修改客户编号(-1退出)：");
                index = CMUtility.readInt();
                if (index == -1) {
                    return;
                }

                c1 = customers.getCustomer(index - 1);
                if (c1 == null) {
                    System.out.println("无法找到指定客户！");
                } else
                    break;
            }

            System.out.print("姓名(" + c1.getName() + ")：");
            String name = CMUtility.readString(4, c1.getName());

            System.out.print("性别(" + c1.getGender() + ")：");
            char gender = CMUtility.readChar(c1.getGender());

            System.out.print("年龄(" + c1.getAge() + ")：");
            int age = CMUtility.readInt(c1.getAge());

            System.out.print("电话(" + c1.getPhone() + ")：");
            String phone = CMUtility.readString(15, c1.getPhone());

            System.out.print("邮箱(" + c1.getEmail() + ")：");
            String email = CMUtility.readString(15, c1.getEmail());

            c1 = new Customer(name, gender, age, phone, email);

            boolean flag = customers.replaceCustomer(index - 1, c1);
            if (flag) {
                System.out
                        .println("---------------------修改完成---------------------");
            } else {
                System.out.println("----------无法找到指定客户,修改失败--------------");
            }
    }
    private void deleteCustomer(){
            System.out.println("---------------------删除客户---------------------");

            int index = 0;
            Customer c2 = null;
            for (;;) {
                System.out.print("请选择待删除客户编号(-1退出)：");
                index = CMUtility.readInt();
                if (index == -1) {
                    return;
                }

                c2 = customers.getCustomer(index - 1);
                if (c2 == null) {
                    System.out.println("无法找到指定客户！");
                } else
                    break;
            }

            System.out.print("确认是否删除(Y/N)：");
            char yn = CMUtility.readConfirmSelection();
            if (yn == 'N')
                return;

            boolean flag = customers.deleteCustomer(index - 1);
            if (flag) {
                System.out
                        .println("---------------------删除完成---------------------");
            } else {
                System.out.println("----------无法找到指定客户,删除失败--------------");
            }
    }
    private void listAllCustomer(){
            System.out.println("---------------------------客户列表---------------------------");
            Customer[] custs = customers.getAllCustomers();
            if (custs.length == 0) {
                System.out.println("没有客户记录！");
            } else {
                System.out.println("编号\t姓名\t\t性别\t\t年龄\t\t\t电话\t\t\t\t邮箱");
                for (int i = 0; i < custs.length; i++) {
//            System.out.println(i + 1 + "\t" + custs[i].getName() + "\t" + custs[i].getGender() + "\t" + custs[i].getAge() + "\t\t" + custs[i].getPhone() + "\t" + custs[i].getEmail());
                    System.out.println((i+1) + "\t" + custs[i].getDetails());
                }
            }

            System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main(String[] args) {
            CustomerView view = new CustomerView();
            view.enterMainMenu();
    }
}
