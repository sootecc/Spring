package polymorphism_2_3_1;

public class TVUser {

	public static void main(String[] args) {
//
//		SamsungTV sTV = new SamsungTV();	//�����ڰ� ���α׷� �ڵ� ������ ���� ��ü�� ������ִ� ������ ����, �����̳� ���� ������ �ϱ� ���� �����̴�.
//		sTV.powerOn();
//		sTV.powerOff();
//		sTV.volumeUp();
//		sTV.volumeDown();
//		
		//������� �䱸�� ���ؼ� SamsungTV���� LgTV�� ����
			//��ü ����, �޼ҵ� �̸� ��� ����
		
		LgTV lTv = new LgTV();
		lTv.turnOn();
		lTv.turnOff();
		lTv.soundUp();
		lTv.soundDown();
		
		
	}

}
