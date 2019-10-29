import javax.swing.*;
public class Capicua{
    static String valor;
    public static void main(String[] args) {
        valor = insertaDato();
        capicua();
    }
    public static String insertaDato(){
        String data;
        data=JOptionPane.showInputDialog("dame un numero");
        return data;
    }
    public static long inverso(){
        String inv="";
        for (int i = valor.length()-1; i >= 0; i--) {
            inv+=valor.charAt(i);
        }
        return Long.valueOf(inv);
    }
    public static void suma(){
        long c = Long.valueOf(valor);
        long c2 = inverso();
        long res = c + c2;
        valor = Long.toString(res);
    }
    public static boolean validacion(){
        for(int i = 0; i < valor.length(); i++){
            if (valor.charAt(i) == valor.charAt(valor.length()-i-1)) {

            } else {
                return true;
            }
        }
        return false;
    }
    public static void capicua(){
        boolean flag=true;
        int c = 0;
        while (flag){
            flag = validacion();
            if(flag){
                suma();
                c++;
            }
        }
        System.out.println(valor + " " + c);
    }
}
