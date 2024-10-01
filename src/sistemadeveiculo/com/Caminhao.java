package sistemadeveiculo.com;

//Criando a classe Caminhao/*
public class Caminhao extends Veiculo {
	 private int eixos;
	    private double pesoBruto;

	    // Criando o construtor da classe caminhao/*
	    public Caminhao(String modelo, int anoFabricacao, int eixos, double pesoBruto) {
	        super(modelo, anoFabricacao); //Chamando o construtor da superclasse/*
	        this.eixos = eixos;
	        this.pesoBruto = pesoBruto;
	    }

	    //Sobrescrevendo o metodo e gerando o insert pro Caminhao/*
	    @Override
	    public String gerarInsert() {
	        return "INSERT INTO Caminhao (modelo, anoFabricacao, eixos, pesoBruto) " +
	               "VALUES ('" + getModelo() + "', " + getAnoFabricacao() + ", " + eixos + ", " + pesoBruto + ");";
	    }
	}


