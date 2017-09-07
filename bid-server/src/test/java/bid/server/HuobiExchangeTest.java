/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bid.server;

import bid.api.Bid;
import bid.api.Exchange;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sihai
 */
public class HuobiExchangeTest {

    public HuobiExchangeTest() {
    }

    @Test
    public void testQueryBidList() {
        Exchange ex = new HuobiExchange();
        List<Bid> list = ex.queryBidList();
        list.forEach(bid -> System.out.println(bid));
    }
    
    @Test
    public void testGetMsg(){
        Exchange ex = new HuobiExchange();
        ex.getMsg(10);
    }

}
