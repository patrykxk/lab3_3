package edu.iis.mto.time;


import org.junit.Test;

public class Tests {

    @Test(expected = OrderExpiredException.class)
    public void orderExpired(){
        Order order = new Order();
        order.submit();
        order.confirm();
    }
}
