package com.example.eurekaserver.config;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableEurekaServer
public class EurekaServerConfiguration {

	/*- custom configuration is done to make eureka server 
	 *  run on custom port - 8090
	 *  
	 *  check application.yml file
	 */

}
