import java.util.Comparator;
import java.util.TreeSet;
public class main {
    public static void main(String[] args) {
        TreeSet<book> Book=new TreeSet<>();

        book book1=new book("mai ve siyah",75,"Halit Ziya Uşaklıgil",1965);
        book book2=new book("Kürk Mantolu Madonna",30,"Sabahattin Ali",1943);
        book book3=new book("Hayvan Çiftliği",100,"George Orwell",1954);
        book book4=new book("Beyaz Zambaklar Ülkesinde",480,"Grigory Petrov",1875);

        Book.add(book1);
        Book.add(book2);
        Book.add(book3);
        Book.add(book4);
        System.out.println("İsme göre sıralama");
        for(book bookName:Book) {
            System.out.println("Book Name:" + bookName.getBookName() +
                    "\nNumber of Page:" + bookName.getnumberOfPages() +
                    "\nAuthor Name" + bookName.getauthorName() +
                    "\nReleased Date" + bookName.getReleaseDate());
            System.out.println(".............................................");
        }
        TreeSet<book> books=new TreeSet<>(new Comparator<book>() {
            @Override
            public int compare(book b1, book b2) {
                return b1.getnumberOfPages()-b2.getnumberOfPages();
            }
        });
        Book.add(book1);
        Book.add(book2);
        Book.add(book3);
        Book.add(book4);
        System.out.println("*****************************************************");
        System.out.println("Sayfaya göre sıralama");
        for(book bookPage:Book) {
            System.out.println("Book Name:" + bookPage.getBookName() +
                    "\nNumber of Page:" + bookPage.getnumberOfPages() +
                    "\nAuthor Name" + bookPage.getauthorName() +
                    "\nReleased Date" + bookPage.getReleaseDate());
            System.out.println(".............................................");
        }
        TreeSet<book> book=new TreeSet<>(new Comparator<book>() {
            @Override
            public int compare(book b1, book b2) {
                return b1.getnumberOfPages()-b2.getnumberOfPages();
            }
        });






        }
    }

