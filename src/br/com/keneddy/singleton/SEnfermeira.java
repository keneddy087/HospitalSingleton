/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.keneddy.singleton;

import br.com.keneddy.grafico.Enfermeira;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SEnfermeira {
    List<Enfermeira> enfermeira = new ArrayList();

    public List<Enfermeira> getEnfermeira() {
        return enfermeira;
    }
    
    
    
    private SEnfermeira() {
    }
    
    public static SEnfermeira getInstance() {
        return SEnfermeiraHolder.INSTANCE;
    }
    
    private static class SEnfermeiraHolder {

        private static final SEnfermeira INSTANCE = new SEnfermeira();
    }
}
