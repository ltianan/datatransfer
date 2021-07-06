package cn.ltianan.study.repository.secondaryRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain2.BookClassMaxOrderNoEntity;

@Repository
public interface BookClassMaxOrderNoJpaRepository extends JpaRepository<BookClassMaxOrderNoEntity,Integer> {
	
	@Query(nativeQuery=false,value="select b from BookClassMaxOrderNoEntity b where b.classNo=:classNo and b.deptId=:deptId")
	public BookClassMaxOrderNoEntity findOneByClassNoAndDeptId(String classNo,int deptId);
}
