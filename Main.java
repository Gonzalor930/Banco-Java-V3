public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        MenuBanco menu = new MenuBanco(banco);
        menu.mostrar();
    }
}
