package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {


    private LocalDate data;




    @Override
    public double calcularXp() {
        return XP_PADRÃO + 20;

    }

    @Override
    public String toString() {
        return "Mentoria{" + " Titulo: " + getTitulo() +
                " -  descrição: " + getDescricao() +
                " -  data: " + data +
                " -  XP: " + XP_PADRÃO +
                '}';
    }


    public LocalDate getData() {
        return data;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }
}
