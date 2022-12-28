package coupling_cohesion;

public class Computer2 {
	
	private USB usb;
    				// 參數多型化
	public void setUSB(USB usb) {
		this.usb = usb;
	}

	public void workWithUSB() {
	usb.work();
}

}
