package polymorphism_2_3_2;

public class TVUser {

	public static void main(String[] args) {

		//SamsungTv tv = new SamsungTV();
		
		LgTV tv = new LgTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
	}
	//인터페이스를 사용하면 약결합을 만들어 유지 보수를 쉽게 할 수 있다.
}
