package com.zzj.service;

import com.zzj.mapper.BookMapper;
import com.zzj.pojo.Admin;
import com.zzj.pojo.Books;

import java.util.List;


public class BookServiceImpl implements BookService{

    //service调dao层  组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }


    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

    /*管理员登录验证*/

    @Override
    public Admin queryAdmin(String username, String password) {
        return bookMapper.queryAdmin(username,password);
    }

}
