/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.keneddy.singleton;

import br.com.keneddy.grafico.Triagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class STriagem {
    List<Triagem> triagem = new ArrayList();

    public List<Triagem> getTriagem() {
        return triagem;
    }
    
    
    
    private STriagem() {
    }
    
    public static STriagem getInstance() {
        return STriagemHolder.INSTANCE;
    }
    
    private static class STriagemHolder {

        private static final STriagem INSTANCE = new STriagem();
    }
}
