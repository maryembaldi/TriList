public class Personne {
    public int id;
    public String nom;
    public String prenom;
    public int age;

    public Personne(int id, String nom, String prenom,int age) {
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equals (Object o){
        if(o==this) return true;
        if (o==null) return false;
        if(o.getClass() !=this.getClass())
            return false;
        Personne p =(Personne) o;
        if(p.id==id && p.prenom==prenom)
        return true ;
        return false;
    }

    public int compareTo(Personne p) {
        return this.nom.compareTo(p.nom);
    }
}
