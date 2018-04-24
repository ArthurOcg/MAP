package MAP.Atividades.Atividade10;

public class GratificacaoGerente implements Gratificacao{

	
	@Override
    public double calcularGratificacao(Funcionario umFuncionario) {
          if (umFuncionario.getNivel >= 2) {
              return umFuncionario.getSalarioBase() * 0.45;
          }
          return umFuncionario.getSalarioBase() * 0.30;
    }
	
}
