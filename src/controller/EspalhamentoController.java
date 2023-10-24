package controller;

import br.edu.fateczl.Lista;

@SuppressWarnings("unchecked")
public class EspalhamentoController {

	Lista<Integer>[] hashTable = new Lista[5];

	public EspalhamentoController() {
		int tamanho = hashTable.length;
		for (int i = 0; i < tamanho; i++) {
			hashTable[i] = new Lista<Integer>();
		}
	}

	public void op(int[] vet) throws Exception {
		for (int i : vet) {
			int hash = hash(i);
			Lista<Integer> l = hashTable[hash];
			if (l.isEmpty()) {
				l.addFirst(i);
			} else {
				l.addLast(i);
			}
		}

		int tamanho = hashTable.length;
		for (int i = 0; i < tamanho; i++) {
			Lista<Integer> l = hashTable[i];
			if (!l.isEmpty()) {
				int size = l.size();
				for (int j = 0; j < size; j++) {
					System.out.print(l.get(j) + " -> ");
				}
				System.out.println("NULL");
			}
		}
	}

	private int hash(int valor) {
		int hash = valor % 5;
		return hash;
	}

}
