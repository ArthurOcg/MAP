package MAP.Atividades.Atividade11;

public class Cliente {

	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Cargo.DESENVOLVEDOR,
				2100, 1);
		System.out.println(umFuncionario.getCargo());
		
		Funcionario outroFuncionario = new Funcionario(Cargo.DBA,
				1700, 2);
		System.out.println(outroFuncionario.getCargo());

	}

}
