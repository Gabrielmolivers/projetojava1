package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		new Thread() {

			public void run() {

				for (int pos = 0; pos < 10; pos++) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println("Executando alguma rotina, por exemplo envio de e-mail");

				}
				System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD.");
			};

		}.start();

		new Thread() {

			public void run() {

				for (int pos = 0; pos < 10; pos++) {

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println("Executando a rotina numero 2, faturamento");

				}
				System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD 2.");
			};

		}.start();

		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}

}
