public class Division implements Calculate {
    @Override
    public int calculate ( int eded1, int eded2 ) {
        if (eded2 == 0) {
            System.out.println("eded2 sifira beraber ola bilmez");
            return 0;
        } else {
            return eded1 / eded2;
        }

    }
}
