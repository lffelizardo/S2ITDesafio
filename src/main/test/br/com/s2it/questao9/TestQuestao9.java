package br.com.s2it.questao9;

import org.junit.Assert;
import org.junit.Test;

public class TestQuestao9 {

	@Test(expected = NullPointerException.class)
    public void binaryTreeNullPointerException() {

        new ExecucaoTest9(null);

    }

	@Test
    public void binaryTreeTestSomarValorRaiz() {

        int expected = 2;
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setValor(expected);

        ExecucaoTest9 execucao = new ExecucaoTest9(binaryTree);

        Assert.assertEquals(expected, execucao.sum());

    }


    @Test
    public void sumUnBalancedBinaryTreeMustReturnCorrectValue() {

        int expected = 40;
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setValor(15);

        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.setValor(20);

        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.setValor(5);

        binaryTree.setLeft(binaryTree1);

        binaryTree1.setLeft(binaryTree2);

        ExecucaoTest9 execucao = new ExecucaoTest9(binaryTree);

        Assert.assertEquals(expected, execucao.sum());

    }

}
