package com.rajesh.finance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.rajesh.finance.FinanceApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FinanceApplication.class)
@WebAppConfiguration
public class FinanceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
