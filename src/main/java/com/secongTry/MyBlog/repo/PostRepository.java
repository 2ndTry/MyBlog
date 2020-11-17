package com.secongTry.MyBlog.repo;

import com.secongTry.MyBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {



}
