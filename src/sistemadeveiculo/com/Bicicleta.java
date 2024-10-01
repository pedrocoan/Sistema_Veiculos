package sistemadeveiculo.com;

   // Criando a classe Bicicleta/*
public class Bicicleta extends Veiculo {
	  private String marca;
	    private String cor;
	    private String material;
	    private int marchas;
	    private boolean amortecedor;

	    //Criando o construtor da classe Bicicleta/*
	    public Bicicleta(String modelo, int anoFabricacao, String marca, String cor, String material, int marchas, boolean amortecedor) {
	        super(modelo, anoFabricacao); //Chamando o construtor da superclasse/*
	        this.marca = marca;
	        this.cor = cor;
	        this.material = material;
	        this.marchas = marchas;
	        this.amortecedor = amortecedor;
	    }

	    //Sobreescrevendo o metodo e gerando o insert da bicicleta/*
	    @Override
	    public String gerarInsert() {
	        return "INSERT INTO Bicicleta (modelo, anoFabricacao, marca, cor, material, marchas, amortecedor) " +
	               "VALUES ('" + getModelo() + "', " + getAnoFabricacao() + ", '" + marca + "', '" + cor + "', '" + material + "', " +
	               marchas + ", " + (amortecedor ? 1 : 0) + ");";
	    }
	}


