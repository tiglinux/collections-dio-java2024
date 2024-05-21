package list;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	
	public static void main(String[] args) throws Exception {
		List<String> carros = new ArrayList<String>();
		List<String> carrosNovos = new ArrayList<String>();
		
		carros.add(0,"Carro1");
		carros.add(1,"Carro2");
		carros.add(2,"Carro2");
		
		//addAll em lista vazia
		carrosNovos.addAll(carros);
		
		carrosNovos.forEach(carroNovo -> System.out.println(carroNovo));
		
	}
}
