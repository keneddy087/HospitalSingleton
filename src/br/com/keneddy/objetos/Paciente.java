
package br.com.keneddy.objetos;

public class Paciente {
   private int id;
   private int numeroSus;
   private Pessoa responsavel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSus() {
        return numeroSus;
    }

    public void setNumeroSus(int numeroSus) {
        this.numeroSus = numeroSus;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public Paciente(int id, int numeroSus) {
        this.id = id;
        this.numeroSus = numeroSus;
    }
}