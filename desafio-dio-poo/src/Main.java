import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso = new Curso();
		curso.setTitulo("Curso de Java");
		curso.setDescricao("Curso de Orientação a Objetos");
		curso.setCargaHoraria(10);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de JS");
		mentoria.setDescricao("Mentoria sobre JS avançado");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp JavaDeveloper");
		bootcamp.setDescricao("Desc. JavaDeveloper");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devGuilherme = new Dev();
		devGuilherme.setNome("Guilherme");
		devGuilherme.inscreverBootcamp(bootcamp);

		System.out.println("Conteúdos Inscritos: " + devGuilherme.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + devGuilherme.getConteudosConcluidos());
		devGuilherme.progredir();
		System.out.println("Conteúdos Inscritos: " + devGuilherme.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + devGuilherme.getConteudosConcluidos());
		devGuilherme.progredir();
		System.out.println("-------------------------------------");
		System.out.println("XP: "+ devGuilherme.calcularTotalXp());
		System.out.println("-------------------------------------");
		
		Dev devAndressa = new Dev();
		devAndressa.setNome("Andressa");
		devAndressa.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteúdos Inscritos: " + devAndressa.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + devAndressa.getConteudosConcluidos());
		System.out.println("-------------------------------------");
		System.out.println("XP: "+ devAndressa.calcularTotalXp());
		System.out.println("-------------------------------------");
		
	}

}
