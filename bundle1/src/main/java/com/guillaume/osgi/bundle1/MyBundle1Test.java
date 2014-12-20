package com.guillaume.osgi.bundle1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class MyBundle1Test implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("bundle1 start");
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("bundle1 stop");
	}
}
