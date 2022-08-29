import java.util.*;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        Books book1=new Books("Hayvan Çiftliği",152,"George Orvell","14/10/1940");
        Books book2=new Books("Kitap Kurdu",28,"Debi Gliori","14/10/2021");
        Books book3=new Books("Sabır",328,"Carrie Jones","09/02/2022");
        Books book4=new Books("İlk Bahar",512,"Wandah Kanfar","19/04,2021");
        Books book5=new Books("AY Işığı Sokağı",25,"Stefan Zweig","10/10/2005");
        Books book6=new Books("Hayvan Çiftliği",152,"George Orvell","14/10/1940");
        Books book7=new Books("Kitap Kurdu",28,"Debi Gliori","14/10/2021");
        Books book8=new Books("Sabır",328,"Carrie Jones","09/02/2022");
        Books book9=new Books("İlk Bahar",512,"Wandah Kanfar","19/04,2021");
        Books book10=new Books("AY Işığı Sokağı",25,"Stefan Zweig","10/10/2005");


        ArrayList<Books> books=new ArrayList<>();
        books.add(book1); books.add(book2);
        books.add(book3); books.add(book4);
        books.add(book5); books.add(book6);
        books.add(book7); books.add(book8);
        books.add(book9); books.add(book10);


        // System.out.println("Kitap İsmi --- Yazar İsmi");
        // books.stream().map(k-> k.getName()+" --- "+k.getAuthor()).forEach(p-> System.out.println(p));

        Map<String,String> booksAndAuthors=new HashMap<>();
        books.stream().forEach(p-> booksAndAuthors.put(p.getName(), p.getAuthor()));

        for (String b:booksAndAuthors.keySet()){
            System.out.println("Kitap : "+ b+", Yazar : "+booksAndAuthors.get(b));
        }


        List<Books> newList=books.stream().filter(p->p.getPage()>100).toList();
        System.out.println("\nSayfa Sayısı 100'den fazla olan kitaplar :");
        for(Books b:newList){
            System.out.println("Kitap Adı : "+b.getName()+" | " +
                    "Sayfa Sayısı : "+b.getPage()+" | "+
                    "Yazar : "+b.getAuthor()+" | "+
                    "Yayın Tarihi : "+b.getReleaseDate());
        }

    }
}
