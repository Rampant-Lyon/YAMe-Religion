package com.sirniloc.yam.econ.capability.interfaces;

import com.sirniloc.yam.econ.capability.Reli;

public interface IReli {

	int getGod();

	void setGod(int d);


	void cloneABS(Reli abs);

	Reli getReli();
}
