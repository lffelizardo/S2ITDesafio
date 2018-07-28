package br.com.s2it.questao8;

public class TerceiroInteiro {

	public Integer gerarTerceiroInteiro(String a, String b) {

		if (a == null || b == null) {
			return -2;
		}
		String c = "";
		int limite = Math.max(a.length(), b.length());
		for (int i = 0; i <= limite; i++) {
			if (i < a.length()) {
				c += a.charAt(i);
			}
			if (i < b.length()) {
				c += b.charAt(i);
			}
		}
		return (c.length() > 6 || c.length()> 1000000) ? -1 : Integer.valueOf(c.toString());
	}

}
