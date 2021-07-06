package cn.ltianan.study.repository.primaryRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain.LtDzheinfoEntity;

@Repository
public interface LtDzheinfoRepository extends CrudRepository<LtDzheinfoEntity,Integer> {
	
}
