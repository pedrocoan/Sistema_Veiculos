package sistemadeveiculo.com;


	public class Automovel extends Veiculo {
	    private String montadora;
	    private String cor;
	    private int kilometragem;
	    private int maxPassageiros;
	    private String tipoFreio;
	    private boolean airbag;

	    public Automovel(String modelo, int anoFabricacao, String montadora, String cor, int kilometragem, int maxPassageiros, String tipoFreio, boolean airbag) {
	        super(modelo, anoFabricacao);
	        this.montadora = montadora;
	        this.cor = cor;
	        this.kilometragem = kilometragem;
	        this.maxPassageiros = maxPassageiros;
	        this.tipoFreio = tipoFreio;
	        this.airbag = airbag;
	    }

	    @Override
	    public String gerarInsert() {
	        return "INSERT INTO Automovel (modelo, anoFabricacao, montadora, cor, kilometragem, maxPassageiros, tipoFreio, airbag) " +
	               "VALUES ('" + getModelo() + "', " + getAnoFabricacao() + ", '" + montadora + "', '" + cor + "', " +
	               kilometragem + ", " + maxPassageiros + ", '" + tipoFreio + "', " + (airbag ? 1 : 0) + ");";
	    }

	}

