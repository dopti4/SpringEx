package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//어노테이션 방식 -> @component("id값")
@Component("tv")
public class LgTv implements TV{
	
	@Autowired					//자동으로 엮겠다. -> 알아서 @component 찾아가네?
	@Qualifier("appleSpeaker")	//qualifier : component 여러 개일 때 특정 지어주는("id값")	
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("Lg --- 전원 켠다.");
	}
	
	public void powerOff() {
		System.out.println("Lg --- 전원 끈다.");
	}
	
	public void volumeUp() {
		//System.out.println("Lg --- 소리 올림.");
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		//System.out.println("Lg --- 소리 내림.");
		speaker.volumeDown();
	}

	
}
