package com.bookapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookapp.model.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {

	// derived queries - queries from properties
	// findBy<PropNAme>
	// getBy
	// readBy

	List<Book> findByAuthor(String author);
	List<Book> getByPriceLessThan(double price);
	List<Book> readByAuthorAndCategory(String author, String category);

	// custom queries
	// for custom queries -> the method name can be anything
	// map it using @Query annotation - add JPQL
	// here Book is not the table name it is class name. so first letter in capital
	@Query("from Book b where b.author = ?1 ")
	List<Book> findByAuth(String author);

	@Query("from Book b where b.price< ?1")
	List<Book> getBooksByLesserPrice(double nprice);
	
	@Query(value = "from Book b where b.author=?1 and b.category=?2")
	List<Book> showByAuthCat(String author, String category);
	
	// NamedQuery
	// create the create in the model class and use it here
	@Query(name = "showBooksAuthTit")
	List<Book> showByAuthTitle(String author,String title);

	// native query uses sql - here pass the book table name
	@Query(value = "select * from book where title like ?1", nativeQuery = true)
	List<Book> getByTitles(String title);
	
}
