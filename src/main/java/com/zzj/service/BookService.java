package com.zzj.service;

import com.zzj.pojo.Admin;
import com.zzj.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增删改查
    int addBook(Books books);
    int deleteBook(int id);
    int updateBook(Books books);
    Books queryBookById(int id);
    //查询所有的书
    List<Books> queryAllBook();
    Books queryBookByName(String bookName);
    //Admin
    Admin queryAdmin(String username,String password);
}
