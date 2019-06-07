package edu.gdkm.weixin.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import edu.gdkm.weixin.library.domain.Book;
import edu.gdkm.weixin.library.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Page<Book> search(String keyword, int pageNumber) {

		// 創建分页条件，页码从外面（页面）传入，每页固定最多10条数据
		Pageable pageable = PageRequest.of(pageNumber, 5);

		Page<Book> page;
		if (StringUtils.isEmpty(keyword)) {
			// 无查询关键字
			// where disabled == false
			page = this.bookRepository.findByDisabledFalse(pageable);

		} else {
			// 有关键字，根据关键子来查询数据
			// where name like '%' + keyword + '%' and disabled == false
			page = this.bookRepository.findByNameContainingAndDisabledFalse(keyword, pageable);

		}

		return page;
	}

}
