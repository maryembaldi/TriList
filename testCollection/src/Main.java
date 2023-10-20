import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList l1 = new ArrayList();

        l1.add(5);
        l1.add("test");
        l1.add(6.2);
        l1.add(5);
        l1.add("test");
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.get(1));

        System.out.println(l1.contains("test"));
        System.out.println(l1.remove(4));
        System.out.println(l1);
        System.out.println(l1.remove((Integer) 5));
        System.out.println(l1);

        Personne p1 = new Personne(1, "Maryem", "Baldi", 23);
        Personne p2 = new Personne(2, "Fatma", "Baldi", 20);
        Personne p3 = new Personne(3, "Emna", "Baldi", 19);
        Personne p4 = new Personne(3, "Emna", "Baldi", 19);
        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        l1.add(p2);
        System.out.println(l1);

        for (int i = 0; i < l1.size(); i++) {
            Object o=l1.get(i);
            System.out.println(o);
            }
        for (Object p:l1){
            System.out.println(p);
        }
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) instanceof Personne){
                Personne p=(Personne) l1.get(i);
                System.out.println(p.getNom());
            }
        }

        ArrayList<Personne> l2 = new ArrayList<Personne>();

        l2.add(p1);
        l2.add(p2);
        l2.add(p3);

        for (int i = 0; i < l2.size(); i++) {
            System.out.println(l2.get(i).getNom());}

        for (Personne p : l2) {
                System.out.println(p.getNom());}

        System.out.println(l2.contains(p1));
        System.out.println(l2.contains(new Personne(3, "Emna", "Baldi", 19)));
        System.out.println(l2.remove(p4));
        System.out.println(l2.remove(new Personne(3, "Emna", "Baldi", 19)));
        System.out.println(p1== p3);

        Collections.sort(l2, Comparator.comparing(Personne::getNom));
        System.out.println("Tri croissant des personnes par nom : " + l2);

        Collections.sort(l2, Comparator.comparing(Personne::getNom, Collections.reverseOrder()));
        System.out.println("Tri décroissant des personnes par nom : " + l2);

        List<Integer> l3 = new ArrayList<>();
        l3.add(4);
        l3.add(2);
        l3.add(7);
        l3.add(1);
        l3.add(5);
        l3.add(6);

        Collections.sort(l3);
        System.out.println( "Tri croissant"+l3);

        Collections.sort(l3, Collections.reverseOrder());
        System.out.println("Tri décroissant "+l3);

        List<String> l4 = new ArrayList<>();
        l4.add("cours");
        l4.add("apple");
        l4.add("séance");
        l4.add("read");

        Collections.sort(l4);
        System.out.println("Tri croissant : " + l4);

        Collections.sort(l4, Collections.reverseOrder());
        System.out.println("Tri décroissant : " +l4);



            }
        }

