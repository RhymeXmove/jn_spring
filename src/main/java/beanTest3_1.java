import org.javaboy.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanTest3_1 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book_1 = (Book) ctx.getBean("book");
        System.out.println(book_1);

        Book book2 = (Book) ctx.getBean("book2");
        System.out.println(book2);

        Book book3 = (Book) ctx.getBean("book3");
        System.out.println(book3);



//        直接通过Class获取Bean, xml中有多个实例时，这种方式不可用，报错。

//        Book book_2 = (Book) ctx.getBean(Book.class);
//        System.out.println(book_2);
    }
}

