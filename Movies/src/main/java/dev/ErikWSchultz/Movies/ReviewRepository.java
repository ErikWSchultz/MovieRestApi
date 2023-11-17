package dev.ErikWSchultz.Movies;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
