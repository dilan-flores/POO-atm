public class Main {
    public static void main(String[] args) {

        ATM datos = new ATM();
        ATM menu = new ATM();

        int op = menu.menu_principal();

        boolean salir = false;

        while(!salir){

        }
        switch(op){
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
        }
    }
}