package com.sipankaj.billingaccount;

import io.github.sipankaj.remoteconfig.annotation.EnableRemoteConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRemoteConfig
public class AccountManagementMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountManagementMsApplication.class, args);
	}
}
