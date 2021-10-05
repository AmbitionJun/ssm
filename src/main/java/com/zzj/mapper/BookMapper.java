package com.zzj.mapper;

import com.zzj.pojo.Admin;
import com.zzj.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.awt.print.Book;
import java.util.List;

public interface BookMapper {
    //增删改查
    int addBook(Books books);
    int deleteBook(@Param("bookID") int id);
    int updateBook(Books books);
    Books queryBookById(@Param("bookID") int id);
    //查询所有的书
    List<Books> queryAllBook();
    Books queryBookByName(@Param("bookName") String bookName);

    //Admin
    Admin queryAdmin(@Param("username") String username,@Param("password") String password);
}
