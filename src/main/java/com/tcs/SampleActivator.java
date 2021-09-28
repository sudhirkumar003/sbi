


package com.tcs;

import com.vektorsoft.demux.core.mva.DMXAdapter;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

/**
 *
 * @author Vladimir Djurovic
 */
public class SampleActivator implements BundleActivator {
    
    private ServiceTracker tracker;

    @Override
    public void start(BundleContext bc) throws Exception {
         tracker = new ServiceTracker(bc, DMXAdapter.class, new SampleCustomizer(bc));
         tracker.open();
    }

    @Override
    public void stop(BundleContext bc) throws Exception {
        tracker.close();
    }

}
