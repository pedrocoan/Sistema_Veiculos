package sistemadeveiculo.com;

//Criando a supeclasse Veiculo/*
public abstract class Veiculo {
	 private String modelo;
	    private int anoFabricacao;

	   //Construtor da classe modelo/*
	    public Veiculo(String modelo, int anoFabricacao) {
	        if (modelo == null || modelo.isEmpty()) {
	            throw new IllegalArgumentException("O modelo é obrigatório.");
	        }
	        if (anoFabricacao <= 0) {
	            throw new IllegalArgumentException("O ano de fabricação deve ser maior que zero.");
	        }
	        this.modelo = modelo;
	        this.anoFabricacao = anoFabricacao;
	    }

	  //Getters/*
	    public String getModelo() {
	        return modelo;
	    }

	    public int getAnoFabricacao() {
	        return anoFabricacao;
	    }

	   //Criando um metodo abstrato para as outras classes poderem sobrescrever/*
	    public abstract String gerarInsert();
	}


