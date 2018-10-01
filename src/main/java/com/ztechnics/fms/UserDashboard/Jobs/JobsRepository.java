package com.ztechnics.fms.UserDashboard.Jobs;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends CrudRepository<Jobs, Long>{
	Iterable<Jobs> findAll();     
}
