package br.com.s2it.questao9;

public class ExecucaoTest9 {

	private BinaryTree binaryTree;

    public ExecucaoTest9(BinaryTree binaryTree) {
    	if(binaryTree == null){
    		throw new NullPointerException("A árvore binária não pode ser nula");
    	}
        this.binaryTree = binaryTree;
    }

    public int sum() {
        return sum(binaryTree);
    }

    private int sum(BinaryTree binaryTree) {

        if (binaryTree == null) {
            return 0;
        }

        return binaryTree.getValor() + sum(binaryTree.getLeft()) + sum(binaryTree.getRight());
    }
}
