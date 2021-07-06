package cn.ltianan.study.repository.secondaryRepository;

import cn.ltianan.study.domain2.CirReaderTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CirReaderTypeRepository extends JpaRepository<CirReaderTypeEntity,Integer> {
	
}
