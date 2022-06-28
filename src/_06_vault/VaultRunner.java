package _06_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		vault.tryCode(5000);
		System.out.print(vault.tryCode(5000));
	
}
}
