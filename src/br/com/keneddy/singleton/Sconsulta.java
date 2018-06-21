/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.keneddy.singleton;

import br.com.keneddy.grafico.Consulta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class Sconsulta {
    List<Consulta> consulta = new ArrayList();

    public List<Consulta> getConsulta() {
        return consulta;
    }
    
    
    
    private Sconsulta() {
    }
    
    public static Sconsulta getInstance() {
        return SconsultaHolder.INSTANCE;
    }
    
    private static class SconsultaHolder {

        private static final Sconsulta INSTANCE = new Sconsulta();
    }
}
