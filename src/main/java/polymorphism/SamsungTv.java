package polymorphism;


//xml 컨테이너 방식
public class SamsungTv implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTv() {
		System.out.println("삼성 --- 기본 생성자 호출.");
	}
	
	public SamsungTv(Speaker speaker) {	//주입!
		this.speaker = speaker;				//이게 DI -> 생성을 외부에서 하고 주입 받아서 세팅하겠다.
		System.out.println("삼성 --- 주입 생성자1 호출.");
	}
	
	public SamsungTv(Speaker speaker, int price) {
		this.speaker = speaker;				//이게 DI -> 생성을 외부에서 하고 주입 받아서 세팅하겠다.
		this.price = price;
		System.out.println("삼성 --- 주입 생성자2 호출.");
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("삼성 --- 전원 켠다.");
	}
	
	public void powerOff() {
		System.out.println("삼성 --- 전원 끈다.");
	}
	
	public void volumeUp() {
		//System.out.println("삼성 --- 소리 올림.");
		//speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		//System.out.println("삼성 --- 소리 내림.");
		//speaker = new SonySpeaker();
		speaker.volumeDown();
	}
	
	public void initMethod() {
		System.out.println("삼성 --- 초기화 코드.");
	}
}
