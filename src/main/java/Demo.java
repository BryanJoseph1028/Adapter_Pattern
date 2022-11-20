public class Demo {
    public static void main(String [] args){
        testClassAdapter();
    }
    private static void testClassAdapter(){
        Adaptador adaptador= new Implemetacion();
        Voltios v3= getVolt(adaptador,3);
        Voltios v12= getVolt(adaptador,12);
        Voltios v110= getVolt(adaptador,110);
        System.out.println("voltaje tipo 3 adaptador"+v3.getVolts());

        System.out.println("voltaje tipo 12 adaptador"+v12.getVolts());

        System.out.println("voltaje tipo 110 adaptador"+v110.getVolts());
    }
    private static Voltios getVolt(Adaptador adaptador, int i){
        switch (i)
        {
            case 3:return adaptador.get3Volt();
            case 12:return adaptador.get12Volt();
            case 110:return adaptador.get110Volt();
            default:return adaptador.get110Volt();
        }
    }
}
