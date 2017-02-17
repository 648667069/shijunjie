package me.shijunjie.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class MessageConsumer implements MessageListener {
	private Logger logger = LoggerFactory.getLogger(MessageConsumer.class);  
	@Override
	public void onMessage(Message message) {
		 logger.info("consumer receive message------->:{}", message);  
		
	}

}
