public class pegawai{
    protected int tarif;

    public static void main (String[] args){
        staff s = new staff();
        supervisor sv = new supervisor();
        gaji g = new gaji();

        g.gajian(sv.tarif);
        g.gajian(s.tarif);
        }
        }
