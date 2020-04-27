package polymorphism;

import java.util.*;

import org.springframework.context.support.AbstractApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {

	public static void main(String[] args) {
		
//		BeanFactory factory = new BeanFactory();
//		
//		Scanner scn = new Scanner(System.in);
//		System.out.println("어떤 TV?");
//		String command = scn.nextLine();
		
		
		//TV tv = new SamsungTv();	//앞에 변수는 인터페이스 형태로, 뒤에만 바꿔주면 된다.

		
		
		
		//xml 파일을 이용해서 인스턴스를 담을 컨테이너 실행해라(IoC컨테이너 가동)!
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		
		//이걸 xml에서 처리해보자.
		//String str = new String("111.222.111.11");
		//String str = (String)factory.getBean("xxx");
		
		
		TV tv = (TV)factory.getBean("tv");	//""안에 bean id 넣어줌.		
		tv = (TV)factory.getBean("tv");
		tv = (TV)factory.getBean("tv");
		tv = (TV)factory.getBean("tv");
		
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}

}
