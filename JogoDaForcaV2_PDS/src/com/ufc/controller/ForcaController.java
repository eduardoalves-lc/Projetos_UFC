package com.ufc.controller;

import com.ufc.service.ForcaSERVICE;

public class ForcaController {

	ForcaSERVICE ForcaSERVICE = new com.ufc.service.ForcaSERVICE();

	public void ForcaC(String Palavra, int numT) {
		ForcaSERVICE.Forca(Palavra, numT);
	}
}
