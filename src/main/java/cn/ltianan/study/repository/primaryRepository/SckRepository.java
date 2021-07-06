package cn.ltianan.study.repository.primaryRepository;

import cn.ltianan.study.domain.SckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SckRepository extends JpaRepository<SckEntity,Integer> {
    List<SckEntity> findByZskid(Integer zskid);

    @Query(nativeQuery=true,value="select distinct bookplace from sck")
    List<String> listBookplaceName();
}
