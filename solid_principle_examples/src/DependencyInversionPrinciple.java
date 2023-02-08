public class DependencyInversionPrinciple {
}
// It breaks the rule
/*
 class Book {
    void seeReviews() {
    }

    void readSample() {
    }
}

 class Shelf {
    Book book;
    void addBook(Book book) {
    }
    void customizeShelf() {
    }
}*/
//follow rule
 interface Product {

    void seeReviews();

    void getSample();

}

 class Book implements Product {

    @Override
    public void seeReviews() {

    }

    @Override
    public void getSample() {

    }
}

 class DVD implements Product {

    @Override
    public void seeReviews() {

    }

    @Override
    public void getSample() {

    }
}
class Shelf {

    Product product;

    void addProduct(Product product) {

    }

    void customizeShelf() {

    }
}