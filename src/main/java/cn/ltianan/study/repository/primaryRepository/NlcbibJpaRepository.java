package cn.ltianan.study.repository.primaryRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain.NlcbibEntity;

@Repository
public interface NlcbibJpaRepository extends JpaRepository<NlcbibEntity,Integer> {
	
	public List<NlcbibEntity> findBySysid(String sysid);
	
	
}
