package sistemadeveiculo.com;

//Criando a classe Skate/*
public class Skate extends Veiculo {

	   private String marca;
	    private String cor;
	    private String tipoRodas;

	    //Criando o construtor da classe/*
	    public Skate(String modelo, int anoFabricacao, String marca, String cor, String tipoRodas) {
	        super(modelo, anoFabricacao); //Chamando a superclasse/*
	        this.marca = marca;
	        this.cor = cor;
	        this.tipoRodas = tipoRodas;
	    }

	    //Sobrescrevendo o metodo e dando insert (colocando os valores) no Skate/*
	    @Override
	    public String gerarInsert() {
	        return "INSERT INTO Skate (modelo, anoFabricacao, marca, cor, tipoRodas) " +
	               "VALUES ('" + getModelo() + "', " + getAnoFabricacao() + ", '" + marca + "', '" + cor + "', '" + tipoRodas + "');";
	    }
	}

