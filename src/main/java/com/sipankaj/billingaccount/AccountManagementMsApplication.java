package com.sipankaj.billingaccount;

import com.sipankaj.remoteconfig.annotation.EnableRemoteConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRemoteConfig
public class AccountManagementMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountManagementMsApplication.class, args);
	}

}
