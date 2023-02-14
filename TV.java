package thing;

class Tv1 implements TVinterface
{
	public void PowerOn()
	{
		System.out.println("Tv is on");
	}
	public void PowerOff()
	{
		System.out.println("Tv is off");
	}
	public void VolumeIncrease(int increment)
	{
		System.out.println("Volume is increasing ");
	}
	public void VolumeDecrease(int decrement)
	{
		System.out.println("Volume is decresing");
	}
	public void BrightnessI(int increment)
	{
		System.out.println("Brightness is increasing");
	}
	public void BrightnessD(int decrement)
	{
		System.out.println("Brightness is decresing");
	}
	public void ChannelChange()
	{
		System.out.println("Channel is changed");
	}
	

	
}
public class TV {
public static void main(String[] args) {
 Tv1 interfaces= new Tv1();
 interfaces.PowerOn();
 interfaces.VolumeIncrease(6);
 interfaces.BrightnessI(12);
 interfaces.VolumeDecrease(5);
 interfaces.BrightnessD(2);
 interfaces.ChannelChange();
 interfaces.PowerOff();
 
 
}
}
