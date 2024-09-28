package com.pranay.blogapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranay.blogapp.entities.Blog;
import com.pranay.blogapp.repository.BlogRepository;

@Service
public class BlogServices {
    @Autowired
    private BlogRepository blogRepository;

    public void saveBlog(Blog blog) {
        blogRepository.save(blog);
    }

    public Iterable<Blog> getAllBlog() {
        return blogRepository.findAll();
    }

    public Blog findBlog(int id) {
        return blogRepository.findById(id).get();
    }

    public void deleteBlog(int id) {
        blogRepository.deleteById(id);
    }
}
