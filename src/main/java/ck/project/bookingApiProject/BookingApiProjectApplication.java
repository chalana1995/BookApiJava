package ck.project.bookingApiProject;

import ck.project.bookingApiProject.entity.Book;
import ck.project.bookingApiProject.entity.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingApiProjectApplication implements CommandLineRunner {

	private final BookRepository bookRepo;

    public BookingApiProjectApplication(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public static void main(String[] args) {
		SpringApplication.run(BookingApiProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book newBook = new Book("Gotham City", "Jeremy Williams", "2000", 250.00);
		bookRepo.save(newBook);
	}
}
