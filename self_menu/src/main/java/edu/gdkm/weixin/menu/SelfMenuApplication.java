package edu.gdkm.weixin.menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import edu.gdkm.commons.config.EventListenerConfig;
import edu.gdkm.commons.domain.event.EventInMessage;

@SpringBootApplication
@EntityScan("edu.gdkm")
@ComponentScan("edu.gdkm")
public class SelfMenuApplication implements EventListenerConfig {

	public static void main(String[] args) {
		SpringApplication.run(SelfMenuApplication.class, args);
	}

	@Override
	public void handle(EventInMessage msg) {
		// 目前此模块不处理任何消息，所以这里留空即可
	}
}
