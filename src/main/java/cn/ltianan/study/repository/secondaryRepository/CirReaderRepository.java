package cn.ltianan.study.repository.secondaryRepository;

import java.util.List;
import java.util.Map;

import cn.ltianan.study.domain2.BookClassMaxOrderNoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain2.BookEntity;
import cn.ltianan.study.domain2.CirReaderEntity;

@Repository
public interface CirReaderRepository extends CrudRepository<CirReaderEntity,Integer> {	
	/**
	 * 获取最大的值模拟数据X开头的标签
	 * @return
	 */
	@Query(nativeQuery=true,value="select * from cir_reader c where c.reader_no like 'R%' order by substring(c.reader_no,2)::::integer desc  limit 1 ")
	public CirReaderEntity getCirReaderEntityByReaderBarcode();
	
	@Query(nativeQuery=true,value="select reader_id from cir_reader where reader_no like 'R%'")
	public List<Map> findTestingReaderIds();

	public CirReaderEntity findByReaderNo(String readerNo);
}
