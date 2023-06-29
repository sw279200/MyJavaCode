package com.xiaochao.object.equals.Test01;

/**
 * @BelongsProject: JavaSECode
 * @BelongsPackOrderId: com.xiaochao.object.equals
 * @Author: 锦猪好有味
 * @CreateTime: 2023-06-29  18:33
 * @Description: TODO
 * @Version: 1.0
 */
public class Order {
    public String name;
    public int OrderId;

    public Order() {
    }

    public Order(String name, int OrderId) {
        this.name = name;
        this.OrderId = OrderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * @Author 锦猪好有味
     * @Description
     * @Date 18:54 2023/6/29
     * @Param [obj]
     * @return boolean
     **/
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj instanceof Order){
            Order order = (Order)obj;
            return this.OrderId==order.OrderId && this.name.equals(order.name);
        }

        return false;
    }
}
