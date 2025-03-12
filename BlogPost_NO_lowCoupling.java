public class BlogPost_NO_lowCoupling {  private String title;
    private String content;
    private String authorName; // Tightly coupled to a specific string representation

    public BlogPost_NO_lowCoupling(String title, String content, String authorName) {
        this.title = title;
        this.content = content;
        this.authorName = authorName;
    }

    public void displayPost() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Author: " + authorName);
    }

    public static void main(String[] args) {
      BlogPost_NO_lowCoupling post = new BlogPost_NO_lowCoupling("My First Blog Post", "This is the content of the blog post.", "John Doe");
        post.displayPost();
    }
}
    

