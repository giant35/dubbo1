/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bid.server;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sihai
 */
public class App {

    public static void main(String[] argv) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo.xml");
        ctx.start();
        while(true){
            System.in.read();
        }        
    }
}
