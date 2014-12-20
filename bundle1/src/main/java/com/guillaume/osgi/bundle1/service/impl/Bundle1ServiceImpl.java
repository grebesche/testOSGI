package com.guillaume.osgi.bundle1.service.impl;

import com.guillaume.osgi.bundle1.service.Bundle1Service;

public class Bundle1ServiceImpl implements Bundle1Service {

	@Override
	public String doubleString(String stringToDouble) {
		return stringToDouble + stringToDouble;
	}
}
