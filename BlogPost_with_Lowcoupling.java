class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


public class BlogPost_with_Lowcoupling {
    private String title;
    private String content;
    private Author author;

    public BlogPost_with_Lowcoupling(String title, String content, Author author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void displayPost() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Author: " + author.getName());
    }

    public static void main(String[] args) {
        Author author = new Author("John Doe");
       BlogPost_with_Lowcoupling post = new BlogPost_with_Lowcoupling("My First Blog Post", "This is the content of the blog post.", author);
        post.displayPost();
    }
}