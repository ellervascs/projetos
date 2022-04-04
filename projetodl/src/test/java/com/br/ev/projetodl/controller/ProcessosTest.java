package com.br.ev.projetodl.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.br.ev.projetodl.model.Processos;

public class ProcessosTest {

	@Test
	public void testGetProcesso() throws Exception {
		Controller ctrl = new Controller();
		List<Processos> processos = new ArrayList<Processos>();
		processos = ctrl.getProcesso("US34558007");
		if(processos.toString() != null) {
			assertNotNull(processos);
		}else {
			assertNull(processos);
		}
		
	}
}
