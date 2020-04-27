package polymorphism;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
@Controller	//	->	컨트롤러	=>	얘만 쓸 것 같다.
//@Service		-> 	모델		//네 개 다 똑같다.
//@Repository	->	DAO
public class SonySpeaker implements Speaker {
	
	public SonySpeaker() {
		System.out.println("소니 스피커 -- 생성");
	}
	
	public void volumeUp() {
		System.out.println("소니 스피커 -- 소리 올림.");
	}
	
	public void volumeDown() {
		System.out.println("소니 스피커 -- 소리 내림.");
	}
	
}
