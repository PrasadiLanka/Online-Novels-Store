package book_customer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

import novelPublisher.Juice_Interface;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
//import org.osgi.util.tracker.ServiceTracker;

public class BcustomerActivator implements BundleActivator {

	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	ServiceReference serviceReference;
	
	@Override
	public void start(BundleContext context) throws Exception {

		System.out.println("Customer service starting\n");
		
		System.out.println("Products\n\nNovel\nNews Paper\nResearch Paper\nBooks\n\n");
		
		System.out.println("What type of Book You Need: ");
		String serviceType = br.readLine();
		
		System.out.println("Service: "+serviceType);
		
		if(serviceType.equalsIgnoreCase("Novel"))
		{
			serviceReference = context.getServiceReference(Novel_Interface.class.getName());
			Novel_Interface Novel = (Novel_Interface) context.getService(serviceReference);
	}
		}

	@Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Stopping customer service\n");
		context.ungetService(serviceReference);
	}

	public void serviceChanged(ServiceEvent ev) {
	}
}

