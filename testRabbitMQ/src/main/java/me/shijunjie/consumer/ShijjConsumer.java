package me.shijunjie.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class ShijjConsumer implements MessageListener {
	private Logger logger = LoggerFactory.getLogger(ShijjConsumer.class);  
	  
    @Override  
    public void onMessage(Message message) {  
        logger.info("shijj receive message------->:{}", message);  
    }  
}
