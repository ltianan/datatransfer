package cn.ltianan.study.repository.primaryRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain.MarczdzchaoEntity;

@Repository
public interface MarczdzchaoRepository extends CrudRepository<MarczdzchaoEntity,Integer> {
	
}
