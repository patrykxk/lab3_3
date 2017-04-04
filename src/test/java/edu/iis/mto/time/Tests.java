package edu.iis.mto.time;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class Tests {

    @Test(expected = OrderExpiredException.class)
    public void orderExpired(){
        Order order = new Order();
        order.submit();
        order.confirm();
    }
    @Test(expected = OrderExpiredException.class)
    public void orderExpiredAndCanceled(){
        Order order = new Order();
        order.submit();
        order.confirm();
        Assert.assertThat(order.getOrderState(),is(equalTo(Order.State.CANCELLED)));
    }
}
