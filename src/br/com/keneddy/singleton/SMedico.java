/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.keneddy.singleton;

import br.com.keneddy.grafico.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SMedico {
    List<Medico> medico = new ArrayList();

    public List<Medico> getMedico() {
        return medico;
    }
    
    
    
    private SMedico() {
    }
    
    public static SMedico getInstance() {
        return SMedicoHolder.INSTANCE;
    }
    
    private static class SMedicoHolder {

        private static final SMedico INSTANCE = new SMedico();
    }
}
