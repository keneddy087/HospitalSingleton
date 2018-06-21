
package br.com.keneddy.objetos;

import java.util.Date;

public class Atestado {
    private Date dataInicioDoAtestado;
    private Date dataFimDoAtestado;
    private Consulta consulta;
    private int quantidadeDias;

    public Date getDataInicioDoAtestado() {
        return dataInicioDoAtestado;
    }

    public void setDataInicioDoAtestado(Date dataInicioDoAtestado) {
        this.dataInicioDoAtestado = dataInicioDoAtestado;
    }

    public Date getDataFimDoAtestado() {
        return dataFimDoAtestado;
    }

    public void setDataFimDoAtestado(Date dataFimDoAtestado) {
        this.dataFimDoAtestado = dataFimDoAtestado;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public Atestado(Date dataInicioDoAtestado, Date dataFimDoAtestado, Consulta consulta, int quantidadeDias) {
        this.dataInicioDoAtestado = dataInicioDoAtestado;
        this.dataFimDoAtestado = dataFimDoAtestado;
        this.consulta = consulta;
        this.quantidadeDias = quantidadeDias;
    }  

    @Override
    public String toString() {
        return "Atestado{" + "dataInicioDoAtestado=" + dataInicioDoAtestado + ", dataFimDoAtestado=" + dataFimDoAtestado + ", consulta=" + consulta + ", quantidadeDias=" + quantidadeDias + '}';
    }
    
}