package com.tweetapp.tweetservice.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tweetapp.tweetservice.entity.Post;
import com.tweetapp.tweetservice.exception.UserException;
import com.tweetapp.tweetservice.repository.PostRepository;
import com.tweetapp.tweetservice.util.LoggerConst;

/**
 * @author Sandeep
 *
 */
@Component
public class PostDaoImpl implements PostDao {

	@Autowired
	PostRepository postRepository;

	@Override
	public Post addTweet(Post post) throws UserException {
		LoggerConst.LOG.info("Add Tweet  - Inside Post Dao");
		return postRepository.save(post);
	}

	@Override
	public List<Post> getAllTweet() throws UserException {
		LoggerConst.LOG.info("Get all tweet  - Inside Post Dao");
		return postRepository.findAll();
	}

	@Override
	public List<Post> getAllTweetByUserName(String userName) throws UserException {
		LoggerConst.LOG.info("Get all tweet by user name - Inside Post Dao");
		return postRepository.findAllByUserName(userName);
	}

	@Override
	public Post updateTweet(Post post) throws UserException {
		LoggerConst.LOG.info("update Tweet  - Inside Post Dao");
		return postRepository.save(post);
	}

	@Override
	public String deleteTweet(String id) throws UserException {
		LoggerConst.LOG.info("Delete tweet  - Inside PostDao");
		postRepository.deleteById(id);
		return "Tweet deleted Successfully";
	}

	@Override
	public Post updateLike(Post post) throws UserException {
		LoggerConst.LOG.info("Update Like  - Inside PostDao");
		return postRepository.save(post);
	}

	@Override
	public Optional<Post> findById(String id) throws UserException {
		LoggerConst.LOG.info("Find by id  - Inside Post Dao");
		return postRepository.findById(id);
	}

	@Override
	public Post replyToTweet(Post post) throws UserException {
		LoggerConst.LOG.info("Invalid userName  - Inside PostDao");
		return postRepository.save(post);
	}

}