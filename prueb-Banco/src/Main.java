public class Main {
    public static void main(String[] args) {

        ATM datos = new ATM();
        ATM menu = new ATM();

        int op;

        boolean salir = false;

        while(!salir){
            switch(op = menu.menu_principal()){
                case 1:{
                    datos.deposito(datos);
                }
                break;
                case 2:{
                    datos.retiro(datos);
                }
                break;
                case 3:{
                    salir = true;
                }
                op = menu.menu_principal();
            }
        }
    }
}