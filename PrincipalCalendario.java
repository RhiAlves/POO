public class PrincipalCalendario {
    public static void main(String[] args) {
        Calendario data1 = new Calendario(14, 8, 2008);  
        Calendario data2 = new Calendario(20, 11, 2007);
 
        data1.mostrarData();
        data1.anoBissexto();
        data2.mostrarData();
        data2.anoBissexto();
    }
}