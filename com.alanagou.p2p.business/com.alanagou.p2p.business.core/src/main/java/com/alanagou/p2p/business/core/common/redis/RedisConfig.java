package com.alanagou.p2p.business.core.common.redis;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

	@Autowired
	private RedisTemplate<?, ?> redisTemplate;

	private  Logger logger = LogManager.getLogger(RedisConfig.class);

	/*
	 * 解决redis插入中文乱码
	 */
	@Bean
	@Scope("prototype")
	public RedisTemplate<?, ?> redisTemplate() {

		// 设置序列化Key的实例化对象
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		// 设置序列化Value的实例化对象
		redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());

		redisTemplate.setHashKeySerializer(new StringRedisSerializer());
		redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

		logger.fatal("解决redis插入中文乱码 fatal");
		logger.error("解决redis插入中文乱码 error");
		logger.warn("解决redis插入中文乱码 warn");
		logger.info("解决redis插入中文乱码 info");
		logger.debug("解决redis插入中文乱码 debug");
		logger.trace("解决redis插入中文乱码 trace");

		return redisTemplate;
	}

}
