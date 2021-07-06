package cn.ltianan.study.repository.primaryRepository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain.NlcbibEntity;
import cn.ltianan.study.dto.NlcbibDTO;

@Repository
public interface NlcbibRepository extends CrudRepository<NlcbibEntity,Integer> {
	@Query(nativeQuery=true,value="select id,sysid,cnmarc from nlcbib TABLESAMPLE SYSTEM(3) where doc_classno is not null limit :num")
	List<Map> findRandomNlcData(@Param("num") Integer num);
}
