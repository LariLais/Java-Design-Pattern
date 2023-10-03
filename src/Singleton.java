public class Singleton {
    // A instância única da classe Singleton
    private static Singleton instance;

    // Um construtor privado para impedir a criação de instâncias diretamente
    private Singleton() {
        // Inicialize aqui, se necessário
    }

    // Um método estático para obter a única instância da classe
    public static Singleton getInstance() {
        // Se a instância ainda não foi criada, crie-a agora
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Métodos adicionais da classe Singleton
    public void showMessage() {
        System.out.println("Esta é uma instância Singleton.");
    }

    public static void main(String[] args) {
        // Obtendo a instância Singleton
        Singleton singleton = Singleton.getInstance();

        // Chamando um método da instância Singleton
        singleton.showMessage();
    }
}
