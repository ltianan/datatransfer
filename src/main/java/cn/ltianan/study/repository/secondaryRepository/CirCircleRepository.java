package cn.ltianan.study.repository.secondaryRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain2.CirCircleEntity;

@Repository
public interface CirCircleRepository extends CrudRepository<CirCircleEntity,Integer> {	
	
}
