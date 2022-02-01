/**
 * 
 */
package org.niranzan.bookstore.repository;

import org.niranzan.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author Dell
 *
 */

@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long> {

}
