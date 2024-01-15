package novelPublisher;

import java.util.Hashtable;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

public class Novel_Service_Activator implements BundleActivator, ServiceListener {

	private static BundleContext context;
	ServiceRegistration serviceRegistration;
	
	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		Novel_Interface Novel = new Novel_Impl();
		
		serviceRegistration = context.registerService(Novel_Interface.class.getName(), Novel, null);
		
		System.out.println("Novel publisher started\n");
		
		Novel.novelService();
	}

	@Override
	public void stop(BundleContext context) throws Exception {

       System.out.println("Novel publisher finished\n");
		
		serviceRegistration.unregister();
	}
	public void serviceChanged(ServiceEvent ev) {
	}
	

	
	
	
	
	/*public void serviceChanged(ServiceEvent ev) {
		ServiceReference<?> sr = ev.getServiceReference();
		switch(ev.getType()) {
			case ServiceEvent.REGISTERED:
			{
				Dictionary dictionary = (Dictionary) fContext.getService(sr);
				service.registerDictionary(dictionary);
			}
			break;
			case ServiceEvent.UNREGISTERING:
			{
				Dictionary dictionary = (Dictionary) fContext.getService(sr);
				service.unregisterDictionary(dictionary);
			}
			break;
		}
	} */


}
