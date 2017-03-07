package com.funcxy.oj.repositories;

import com.funcxy.oj.models.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.stream.Stream;

/**
 * User DAO
 * @author ddhee
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findById(ObjectId id);
    List<User> findByUsernameLike (String username);
    User findOneByEmail(String email);
    User findOneByUsername(String username);
    List<User> findByEmail(String email);
    List<User> findByUsername(String username);
    List<User> findByLocation(String location);
    List<User> findByNicknameLike(String nickname);
    List<User> findByBioLike(String bio);
}
