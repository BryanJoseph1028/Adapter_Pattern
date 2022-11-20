public class Implemetacion extends Socket implements Adaptador{

    @Override
    public Voltios get110Volt() {
        return getVolt();
    }

    @Override
    public Voltios get12Volt() {
        Voltios v=getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Voltios get3Volt() {
        Voltios v=getVolt();
        return convertVolt(v,40);
    }
    public Voltios convertVolt(Voltios v,int i) {
        return new Voltios(v.getVolts()/i);
    }
}
