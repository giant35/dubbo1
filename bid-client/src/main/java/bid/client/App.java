/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bid.client;

import bid.api.Bid;
import bid.api.Exchange;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sihai
 */
public class App {

    private static final Logger LOG = Logger.getLogger(App.class.getName());

    static Boolean running = true;

    public static void main(String[] argv) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/dubbo.xml");
        ctx.start();
        Exchange ex = (Exchange) ctx.getBean("exchange");
        Thread t = new Thread(() -> {
            while (running) {
//                List<Bid> list = ex.queryBidList();
//                list.forEach(bid -> System.out.println(bid.toString()));
                //FIX: not work Bid b = ex.queryTopBid();
                //System.out.println(b);
                
                String s = ex.getMsg(111);
                System.out.println(s);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex1) {
                    LOG.log(Level.SEVERE, null, ex1);
                }
            }
        });
        t.start();
        for (int i = 0; i < 10; ++i) {
            System.in.read();
        }
        running = false;
        t.join();
    }
}
