public class Test {
    public static void main(String[] args){
        //创建一个客户对象
        Customer customer=new Customer();
        //给对象的属性赋值，相当于注册账号时，填写自己的信息
        customer.customerId="001";
        customer.customerName="流星";
        customer.customerAddress="桂林市";
        customer.customerPhone="12345789921";


        Order order=new Order();
        order.orderId="003";//在商城中市自动生成的
        order.orderAmmount="888f";//金额

        //把客户和订单进行关联
        customer.order=order;
        //需求：客户要查询他下订单的金额
        System.out.println("您的订单金额为"+customer.order.orderAmmount);
    }
}
