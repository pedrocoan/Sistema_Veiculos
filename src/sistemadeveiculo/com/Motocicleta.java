package sistemadeveiculo.com;

   // Criando a classe Motocicleta/*
public class Motocicleta extends Veiculo {
	   private int cilindradas;
	    private double torque;

	    //Criando o construtor da classe Motocicleta/*
	    public Motocicleta(String modelo, int anoFabricacao, int cilindradas, double torque) {
	        super(modelo, anoFabricacao); //Chamando o construtor da superclasse/*
	        this.cilindradas = cilindradas;
	        this.torque = torque;
	    }

	    //Sobrescrevendo o metodo e gerando o insert da Motocicleta/*
	    @Override
	    public String gerarInsert() {
	        return "INSERT INTO Motocicleta (modelo, anoFabricacao, cilindradas, torque) " +
	               "VALUES ('" + getModelo() + "', " + getAnoFabricacao() + ", " + cilindradas + ", " + torque + ");";
	    }

}
