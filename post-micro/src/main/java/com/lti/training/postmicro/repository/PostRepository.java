package com.lti.training.postmicro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.training.postmicro.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

	List<Post> findByUserId(Integer userId);
	
}
