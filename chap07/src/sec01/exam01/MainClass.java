package sec01.exam01;

public class MainClass {
	
	public static void main(String[] args) {
		
		DmbCellPhone c1 = new DmbCellPhone("자바폰", "검정", 10);
		
		
		// inherited fields
		System.out.println(c1.model);
		System.out.println(c1.color);
		
		// unique field
		System.out.println(c1.channel);
		
		// inherited methods
		c1.powerOn();
		c1.bell();
		c1.sendVoice("Hello?");
		c1.receiveVoice("Hi?");
		c1.sendVoice("Sorry...");
		c1.hangUp();
		c1.powerOff();
		
		// unique method
		c1.turnOnDmb();
		c1.changeChannelDmb(20);
		c1.turnOffDmb();
	}
	
}
