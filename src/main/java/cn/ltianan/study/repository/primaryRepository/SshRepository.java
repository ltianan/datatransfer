package cn.ltianan.study.repository.primaryRepository;

import cn.ltianan.study.domain.SshEntity;
import org.springframework.data.repository.CrudRepository;

public interface SshRepository extends CrudRepository<SshEntity,Integer> {
}
