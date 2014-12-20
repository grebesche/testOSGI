package com.guillaume.osgi.bundle2.service.impl;

import com.guillaume.osgi.bundle2.service.Bundle2Service;

public class Bundle2ServiceImpl implements Bundle2Service {

	@Override
	public String addTestAtTheEnd(String string) {
		return string + "Test";
	}
}
