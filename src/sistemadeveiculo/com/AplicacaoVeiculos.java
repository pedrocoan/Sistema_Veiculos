package sistemadeveiculo.com;

public class AplicacaoVeiculos {

	
		public static void main(String[] args) {
	        // Gerando o automovel/*
	        Automovel automovel = new Automovel("Fusca", 1975, "Volkswagen", "Azul", 120000, 5, "Disco", true);
	        System.out.println(automovel.gerarInsert());

	        //Gerando a Motocicleta/*
	        Motocicleta moto = new Motocicleta("CB500", 2018, 500, 43.5);
	        System.out.println(moto.gerarInsert());

	        //Gerando o caminhao/*
	        Caminhao caminhao = new Caminhao("Scania R450", 2020, 4, 18000);
	        System.out.println(caminhao.gerarInsert());

	       //Gerando a bicicleta/*
	        Bicicleta bicicleta = new Bicicleta("Caloi Elite", 2021, "Caloi", "Preta", "Alumínio", 21, true);
	        System.out.println(bicicleta.gerarInsert());

	        //Gerando o skate/*
	        Skate skate = new Skate("Black SHEEP", 2022, "Black Sheep", "Branca", "Bones");
	        System.out.println(skate.gerarInsert());
	    
	
	}

}
