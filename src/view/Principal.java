package view;

import controller.EspalhamentoController;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {3, 69, 96, 73, 53, 42, 20, 51, 83, 50};
		EspalhamentoController eCont = new EspalhamentoController();
		
		try {
			eCont.op(vetor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
