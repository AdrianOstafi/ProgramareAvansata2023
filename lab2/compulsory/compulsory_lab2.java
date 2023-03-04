package lab2.compulsory;

public class compulsory_lab2 {
    public static void main(String[] args) {
        Locations c1 = new Locations("Iasi", 10 , 55.5F, Enum_Location.Cities);
        Locations c2 = new Locations("Bucuresti", 8 , 29.5F, Enum_Location.Cities);
        Roads r1 = new Roads(Enum_Road.COUNTRY, c1, c2);
        System.out.println(r1);
        System.out.println(c2);
    }
}
