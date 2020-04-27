package polymorphism;

import org.springframework.stereotype.Component;

@Component
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("애플 스피커 -- 생성");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("애플 스피커 -- 소리 올림.");
	}

	@Override
	public void volumeDown() {
		System.out.println("애플 스피커 -- 소리 내림.");
	}
	
	
	
}
