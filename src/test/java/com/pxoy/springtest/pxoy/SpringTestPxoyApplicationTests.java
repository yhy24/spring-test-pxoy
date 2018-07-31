package com.pxoy.springtest.pxoy;

import com.pxoy.springtest.pxoy.proxyLog.ProxyInVa;
import com.pxoy.springtest.pxoy.service.CalculateService;
import com.pxoy.springtest.pxoy.service.UserService;
import com.pxoy.springtest.pxoy.service.impl.CalculateServiceImpl;
import com.pxoy.springtest.pxoy.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTestPxoyApplicationTests {

	@Test
	public void contextLoads() {

		/*CalculateService calculateService = new CalculateServiceImpl();
		System.out.println("-----------没有日志的测试:-------------:"+calculateService.addTest(3,4));


		System.out.println("---------------------分界线---------------------------------");

		CalculateService calculateService1 = (CalculateService) new ProxyInVa(calculateService).getInstance();
		System.out.println("--------使用动态代理测试添加日志测试-----------:"+calculateService1.addTest(3,5));
		System.out.println("--------使用动态代理测试添加日志测试-----------:"+calculateService1.productTest(4,6));*/

		UserService userService = new UserServiceImpl();

		UserService userService1 = (UserService) new ProxyInVa(userService).getInstance();
		System.out.println("------进行代理--------"+userService1.tesProxy(123));


	}

}
