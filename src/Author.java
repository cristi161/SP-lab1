public class Author {
    private String name;

    public void print(){
        System.out.println("Author " + name);
    }

    public Author(String name) {
        this.name = name;
    }
}