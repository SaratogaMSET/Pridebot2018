public class OI {
			
	Joystick stick1 = new Joystick(0);		
	
	public boolean button1() {	
		return stick1.getRawButton(1);	
	}	
		
	public boolean button2() {	
		return stick1.getRawButton(2);	
	}	
		
	public boolean button3() {	
		return stick1.getRawButton(3);	
	}	
		
	public boolean button4() {	
		return stick1.getRawButton(4);	
	}	
		
	public double axis0() {	
		return stick1.getRawAxis(0);	
	}	
		
	public double axis1() {	
		return stick1.getRawAxis(1);	
	}	
		
	public double axis4() {	
		return stick1.getRawAxis(4);	
	}	
		
	public double axis5() {	
		return stick1.getRawAxis(5);	
	}	
		
	public double POV(int x) {	
		return stick1.getPOV(x);	
	}		
			
}
