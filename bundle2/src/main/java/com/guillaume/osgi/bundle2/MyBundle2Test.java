package com.guillaume.osgi.bundle2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class MyBundle2Test implements BundleActivator {

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("bundle2 start");
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("bundle2 stop");
	}
}
