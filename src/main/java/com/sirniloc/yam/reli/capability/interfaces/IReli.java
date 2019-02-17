package com.sirniloc.yam.reli.capability.interfaces;

import com.sirniloc.yam.reli.capability.Reli;

public interface IReli {

	int getGod();

	void setGod(int d);

	public double getAlignment();

	public void setAlignment(double alignment);

	void cloneABS(Reli abs);

	Reli getReli();

	void setDivineFavor(double double1);

	double getDivineFavor();
}
