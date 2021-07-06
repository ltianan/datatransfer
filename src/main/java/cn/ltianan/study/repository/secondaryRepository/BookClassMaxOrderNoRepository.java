package cn.ltianan.study.repository.secondaryRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain2.BookClassMaxOrderNoEntity;

@Repository
public interface BookClassMaxOrderNoRepository extends CrudRepository<BookClassMaxOrderNoEntity,Integer> {
	
	
}
