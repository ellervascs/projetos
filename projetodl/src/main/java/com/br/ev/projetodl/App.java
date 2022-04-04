package com.br.ev.projetodl;

import java.util.ArrayList;
import java.util.List;

import com.br.ev.projetodl.controller.Controller;
import com.br.ev.projetodl.model.Processos;

public class App 
{
    public static void main( String[] args )
    {
        Controller controller = new Controller();
        List<Processos> lista = new ArrayList<Processos>();
        try {
			lista = controller.getProcesso("US34558007");
			System.out.println(lista.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
