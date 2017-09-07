/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bid.server;

import bid.api.Bid;
import bid.api.Exchange;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author sihai
 */
public class HuobiExchange implements Exchange {

    private final Random random = new Random();

    @Override
    public List<Bid> queryBidList() {
        ArrayList ret = new ArrayList();
        ret.add(queryTopBid());
        return ret;
        //unserializable return Arrays.asList(b);
    }

    @Override
    public Bid queryTopBid() {
        Bid b = new Bid();
        b.setDate(LocalDateTime.now());
        b.setPrice(BigDecimal.valueOf(random.nextInt(1000)));
        b.setQuantity(BigDecimal.valueOf(random.nextInt(10)));
        return b;
    }

    @Override
    public String getMsg(int i) {
        return String.format("i:%d", i);
    }

}
