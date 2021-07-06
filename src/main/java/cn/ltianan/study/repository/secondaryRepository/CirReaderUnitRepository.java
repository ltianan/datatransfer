package cn.ltianan.study.repository.secondaryRepository;

import cn.ltianan.study.domain2.CirReaderUnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CirReaderUnitRepository extends JpaRepository<CirReaderUnitEntity,Integer> {
	
}
