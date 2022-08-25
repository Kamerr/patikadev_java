public class book implements Comparable<book>{
    private String bookName;
    private int numberOfPages;
    private String authorName;
    private int releaseDate;

    public book(String bookName,int numberOfPages,String authorName,int releaseDate){
        this.bookName=bookName;
        this.numberOfPages=numberOfPages;
        this.authorName=authorName;
        this.releaseDate=releaseDate;
        }
        public String getBookName(){
            return bookName;
        }
        public void setBookName(String bookName){
            this.bookName=bookName;
        }
        public int getnumberOfPages(){
            return numberOfPages;
        }
        public void setnumberOfPages(int numberOfPages){
            this.numberOfPages=numberOfPages;
        }
        public String getauthorName(){
             return authorName;
        }
        public void setauthorName(String authorName){
            this.authorName=authorName;
        }
        public int getReleaseDate(){
            return releaseDate;
        }
        public void setReleaseDate(int releaseDate){
            this.releaseDate=releaseDate;
        }
        @Override
        public int compareTo(book b){
            return getBookName().compareTo(b.getBookName());
        }
}

