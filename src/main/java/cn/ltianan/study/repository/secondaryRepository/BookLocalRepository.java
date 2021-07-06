package cn.ltianan.study.repository.secondaryRepository;

import cn.ltianan.study.domain2.BookLocalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookLocalRepository extends JpaRepository<BookLocalEntity,Integer> {
	
}
