package com.project.apptruistic.persistence.repository;

import com.project.apptruistic.logic.CreatorType;
import com.project.apptruistic.persistence.domain.Opportunity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface OpportunityRepository extends MongoRepository<Opportunity, String>, OpportunityRepositoryCustom {

    Optional<Opportunity> findOneByName(String name);

    Optional<Opportunity> findOneByHashcode(int hashcode);

    List<Opportunity> findAllByDoneFalse();

    Set<Opportunity> findAllByCreatorType(CreatorType creatorType);
}
