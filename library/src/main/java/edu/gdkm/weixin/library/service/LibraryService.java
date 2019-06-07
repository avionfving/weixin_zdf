package edu.gdkm.weixin.library.service;

import org.springframework.data.domain.Page;

import edu.gdkm.weixin.library.domain.Book;

public interface LibraryService {

	Page<Book> search(String keyword, int pageNumber);

	
}
