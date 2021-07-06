package cn.ltianan.study.repository.secondaryRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain2.BibMaxRecordIdEntity;

@Repository
public interface BibMaxRecordIdRepository extends CrudRepository<BibMaxRecordIdEntity,Integer> {	
	
}
