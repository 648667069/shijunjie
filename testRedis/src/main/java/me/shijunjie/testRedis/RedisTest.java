package me.shijunjie.testRedis;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.shijunjie.util.RedisUtil;

public class RedisTest {
	
	private Logger logger = LoggerFactory.getLogger(RedisTest.class);  
	
	 private ApplicationContext context = null;
	 private RedisUtil redisUtil;
	
	@Before
	public void before() {
		System.out.println("初始化spring容器");
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		redisUtil = (RedisUtil) context.getBean("redisUtil");
	}
	
	@Test
	public void testSet() {
		boolean isset = redisUtil.set("test", "hh");
		System.out.println(isset);
		Object value = redisUtil.get("test");
		System.out.println(value);
	}
	
}
