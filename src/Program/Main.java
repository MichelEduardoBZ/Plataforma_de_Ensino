package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Lesson;
import Entities.Task;
import Entities.Video;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Instanciando a lista
		
		List<Lesson> list = new ArrayList<>();
		
		//Quantidade de aulas
		
		System.out.print("Quantas aulas tem o curso? ");
		String numberClasses = entrada.nextLine();
		int numberClassesValidated = Integer.parseInt(numberClasses);
		
		for(int i = 0; i < numberClassesValidated; i++) {
			
			System.out.println();
			System.out.println("Dados da " + (i + 1) + "a aula:");
			
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char ct = entrada.nextLine().charAt(0);
			
			System.out.print("Título: ");
			String title = entrada.nextLine();
			
			if(ct == 'c') {
				System.out.print("URL do vídeo: ");
				String urlVideo = entrada.nextLine();
				
				System.out.print("Duração em segundos: ");
				String durationVideo = entrada.nextLine();
				int durationVideoValidated = Integer.parseInt(durationVideo);
			//Adicionando na lista
				list.add(new Video(title, urlVideo, durationVideoValidated));
			
			} else {
			
				System.out.print("Descrição: ");
				String description = entrada.nextLine();
				
				System.out.print("Quantidade de questões: ");
				String quantityQuestions = entrada.nextLine();	
				int quantityQuestionsValidated = Integer.parseInt(quantityQuestions);
			//Adicionando na lista
				list.add(new Task(title, description, quantityQuestionsValidated));
			}
		}
		
		// For para apresentação do tempo total do curso
		
		double totalDuration = 0;
		
		for(Lesson x : list) {
			totalDuration += x.duration();
		}
		
		System.out.println();
		System.out.println("Duração total do curso = " + totalDuration + " segundos.");
	}
	
}
