/**
 * 
 */
package org.niranzan.bookstore.repository;

import org.niranzan.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Dell
 *
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
