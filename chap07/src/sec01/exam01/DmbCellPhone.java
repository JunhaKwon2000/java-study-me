package sec01.exam01;

// sub class: common traits are inherited, plus the unique field/method of the child
// here, we add only the dmb
public class DmbCellPhone extends CellPhone {
	// field 
	int channel;
	
	
	// constructor
	public DmbCellPhone(String model, String color, int channel) {
		super(); // call super class constructor(automatically adds if not added)
		this.model = model; // inherited
		this.color = color; // inherited
		this.channel = channel;
	}
	
	// method
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
}
