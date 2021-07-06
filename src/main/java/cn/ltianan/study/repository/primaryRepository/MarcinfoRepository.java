package cn.ltianan.study.repository.primaryRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain.MarcinfoEntity;

@Repository
public interface MarcinfoRepository extends CrudRepository<MarcinfoEntity,Integer> {
	
}
