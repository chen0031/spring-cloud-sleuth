package org.springframework.cloud.sleuth.instrument;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.messaging.TraceSpringIntegrationAutoConfiguration;
import org.springframework.cloud.sleuth.instrument.messaging.websocket.TraceWebSocketAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@EnableAutoConfiguration(exclude = { LoadBalancerAutoConfiguration.class,
		JmxAutoConfiguration.class, TraceSpringIntegrationAutoConfiguration.class,
		TraceWebSocketAutoConfiguration.class })
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
public @interface DefaultTestAutoConfiguration {
}
