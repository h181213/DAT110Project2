package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;

public class TemperatureDevice {
	
	private static final int COUNT = 10;
	
	public static void main(String[] args) {
		
		TemperatureSensor sn = new TemperatureSensor();
		
		// TODO - start
		Client temperatureDevice = new Client("TemperatureDevice", Common.BROKERHOST, Common.BROKERPORT);
		temperatureDevice.connect();
		
		for ( int i = 0; i < COUNT; i++) {
			int temp = sn.read();
			temperatureDevice.publish(Common.TEMPTOPIC, "Temp : " + temp);
			
			//Wait and read again
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		// TODO - end
		
		System.out.println("Temperature device stopping ... ");
		
		
		
	}
}
