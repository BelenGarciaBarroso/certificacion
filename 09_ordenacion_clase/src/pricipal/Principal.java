package pricipal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Curso;

public class Principal {

	public static void main(String[] args) {
		
		List<Curso> cursos=new ArrayList<>(List.of(new Curso("Java",100,LocalDate.of(11, 3, 2023)),
											new Curso("PHP",120,LocalDate.of(15, 6, 2024)),
											new Curso("Python",100,LocalDate.of(8, 10, 2022)),
											new Curso("Angular",80,LocalDate.of(26, 7, 2023))
				));
		
		Collections.sort(cursos, new Comparator<Curso>() {

			@Override
			public int compare(Curso o1, Curso o2) {
				if (o1.getFechaInicio().equals())
				return 0;
			}
		}
	}
}
		
			
		
	