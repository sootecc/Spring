package polymorphism_2_3_1;

public class TVUser {

	public static void main(String[] args) {
//
//		SamsungTV sTV = new SamsungTV();	//개발자가 프로그램 코드 내에서 직접 객체를 만들어주는 강결합 상태, 수정이나 유지 보수를 하기 힘든 상태이다.
//		sTV.powerOn();
//		sTV.powerOff();
//		sTV.volumeUp();
//		sTV.volumeDown();
//		
		//사용자의 요구로 인해서 SamsungTV에서 LgTV로 변경
			//객체 생성, 메소드 이름 모두 변경
		
		LgTV lTv = new LgTV();
		lTv.turnOn();
		lTv.turnOff();
		lTv.soundUp();
		lTv.soundDown();
		
		
	}

}
