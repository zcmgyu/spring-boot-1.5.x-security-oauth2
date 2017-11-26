package com.github.zcmgyu.repository;

import com.github.zcmgyu.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

//public interface UserRepository extends CrudRepository<User, Long> {
//
//	User findByLogin(String login);
//}
public interface UserRepository extends MongoRepository<User, String> {

	User findByUsername(String login);
}
