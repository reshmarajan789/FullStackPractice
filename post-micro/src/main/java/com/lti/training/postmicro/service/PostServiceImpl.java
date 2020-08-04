package com.lti.training.postmicro.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lti.training.postmicro.dto.PostDataDto;
import com.lti.training.postmicro.dto.PostDetailDto;
import com.lti.training.postmicro.dto.PostDetailListDto;
import com.lti.training.postmicro.dto.PostDto;
import com.lti.training.postmicro.dto.UserDetailDto;
import com.lti.training.postmicro.entity.Post;
import com.lti.training.postmicro.repository.PostRepository;



@Service
public class PostServiceImpl implements PostService {
	
	private PostRepository postRepository;
	private RestTemplate restTemplate;
	
	private static final String USER_URL = "http://localhost:6061/user-micro/user";
	/*
	@Value("${postmicro.user.url}")
	private String url;
	*/
	@Autowired
	private Environment environment;
	@Autowired
	public PostServiceImpl(PostRepository postRepository,RestTemplate restTemplate) {
		this.postRepository = postRepository;
		this.restTemplate = restTemplate;
		
	}

	@Override
	public PostDetailDto addPost(Integer userId, PostDto postDto) {
		//convert the DTo into entity
		Post post=new Post(null,userId,postDto.getTitle(),postDto.getTags(),postDto.getPost());
		
		// persist into DB
	post=this.postRepository.save(post);
	// connect/call user-micro service
			// String url = environment.getProperties().get("postmicro.user.url").toString();
	UserDetailDto userDetailDto = 
			this.restTemplate.getForObject(USER_URL + "/get/" + userId, UserDetailDto.class);
//create DTO
	
	
	PostDetailDto postDetailDto=new PostDetailDto(post.getId(),post.getTags(),post.getTitle(),post.getPost(),userDetailDto);
		return postDetailDto;
	}
	
	@Override
	public PostDetailListDto getAllPost(Integer userId) {
		// get user data from user-micro
		UserDetailDto userDetailDto = 
				this.restTemplate.getForObject(USER_URL + "/get/" + userId, UserDetailDto.class);
		// get data from database
		List<Post> posts = this.postRepository.findByUserId(userId);
		// convert all Post object(entity) into PostDataDto(DTO)
		/*List<PostDataDto> postDataList = new ArrayList<PostDataDto>();
		for(Post post : posts) {
			PostDataDto postDataDto = 
					new PostDataDto(post.getId(), 
									post.getTitle(), 
									post.getTags(), 
									post.getPost());
			postDataList.add(postDataDto);
		}*/
		/*List<PostDataDto> postDataList = 
				posts.stream()
				.map(post->{
					PostDataDto postDataDto = 
							new PostDataDto(post.getId(), 
											post.getTitle(), 
											post.getTags(), 
											post.getPost());
					// return postDataDto;
				}).collect(Collectors.toList());*/
		List<PostDataDto> postDataList = 
				posts.stream()
				.map(post-> new PostDataDto(post.getId(), 
						post.getTitle(), 
						post.getTags(), 
						post.getPost()))
				.collect(Collectors.toList());
					
		
		// assemble
		PostDetailListDto postDetailListDto = 
				new PostDetailListDto(userDetailDto, postDataList);
		
		return postDetailListDto;
	}



}
