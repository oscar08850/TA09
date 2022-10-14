package Ex1;

public enum ConsumoElectrico {
	// declaro las letras de consumo enumerable y el char de retorno
	A('A'), B('B'), C('C'), D('D'), E('E'), F('F');

	// atributos del enum
	char consumo;

	// declaro el constructor
	ConsumoElectrico(char consumo) {
		this.consumo = consumo;
	}
}