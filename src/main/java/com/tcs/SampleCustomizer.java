


package com.tcs;

import com.vektorsoft.demux.core.mva.DMXAdapter;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

/**
 *
 * @author Vladimir Djurovic
 */
public class SampleCustomizer implements ServiceTrackerCustomizer<DMXAdapter, DMXAdapter> {
    
    private BundleContext context;
    
    public SampleCustomizer(BundleContext ctx){
        this.context = ctx;
    }

    @Override
    public DMXAdapter addingService(ServiceReference<DMXAdapter> sr) {
        DMXAdapter svc = (DMXAdapter)context.getService(sr);
        
        // register views and controllers here
//         svc.registerController(new HelloController());
//         HelloView view = new HelloView();
//         view.setAdapter(svc);
//         svc.registerView(view);
       return svc;
    }

    @Override
    public void modifiedService(ServiceReference<DMXAdapter> sr, DMXAdapter t) {
        
    }

    @Override
    public void removedService(ServiceReference<DMXAdapter> sr, DMXAdapter t) {

    }

}
