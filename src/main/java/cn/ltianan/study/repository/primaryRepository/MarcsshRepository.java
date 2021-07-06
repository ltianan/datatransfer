package cn.ltianan.study.repository.primaryRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain.MarcsshEntity;

@Repository
public interface MarcsshRepository extends CrudRepository<MarcsshEntity,Integer> {
	
}
