package com.pranay.blogapp.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.pranay.blogapp.entities.Blog;

@Repository
public interface BlogRepository extends CrudRepository <Blog, Integer>{
    
}
