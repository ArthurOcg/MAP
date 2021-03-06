package MAP.Atividades.Atividade11;

public enum Cargo implements Gratificacao{

	
	DESENVOLVEDOR{
        @Override
        public double calcularGratificacao(Funcionario umFuncionario) {
        	if (umFuncionario.getNivel() >= 2) {
                return umFuncionario.getSalarioBase() * 0.25;
            }
            return umFuncionario.getSalarioBase() * 0.15;
        }
    },
    DBA {
        @Override
        public double calcularGratificacao(Funcionario umFuncionario) {
        	if (umFuncionario.getNivel() >= 2) {
                return umFuncionario.getSalarioBase() * 0.25;
            }
            return umFuncionario.getSalarioBase() * 0.15;
        }
    },
    LIDER {
        @Override
        public double calcularGratificacao(Funcionario umFuncionario) {
        	 if (umFuncionario.getNivel() >= 2) {
                 return umFuncionario.getSalarioBase() * 0.35;
             }
             return umFuncionario.getSalarioBase() * 0.25;
        }
    },
	
	GERENTE {
        @Override
        public double calcularGratificacao(Funcionario umFuncionario) {
        	 if (umFuncionario.getNivel() >= 2) {
                 return umFuncionario.getSalarioBase() * 0.45;
             }
             return umFuncionario.getSalarioBase() * 0.30;
        }
    };
	
	
}
