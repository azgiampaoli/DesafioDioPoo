import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(15);

        Curso curso2 = new Curso();
        curso2.setTitulo("C");
        curso2.setDescricao("Curso C");
        curso2.setCargaHoraria(20);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Java Iniciante");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Super Java");
        bootcamp.setDescricao("Java Avançado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Joao");
        dev.inscreverBootcamp(bootcamp);

        Dev dev1 = new Dev();
        dev1.setNome("Angela");
        dev1.inscreverBootcamp(bootcamp);


        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos() );
        System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());

        dev1.progredir();
        System.out.println("Conteudos concluidos" + dev1.getConteudosConcluidos());
        System.out.println(dev1.calcularTotalXP());



    }
}
