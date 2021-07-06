package cn.ltianan.study.repository.secondaryRepository;

import java.util.List;
import java.util.Map;

import cn.ltianan.study.domain2.CirReaderEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.ltianan.study.domain2.BookEntity;

@Repository
public interface BookRepository extends CrudRepository<BookEntity,Integer> {
	/**
	 * 获取最大的值模拟数据X开头的标签
	 * @return
	 */
	@Query(nativeQuery=true,value="select * from book b where b.book_barcode like 'X%' order by replace(b.book_barcode,'X','')::::integer desc  limit 1 ")
	public BookEntity getBookEntityByBookBarcode();

	@Query(nativeQuery=true,value="select book_id from book b where b.book_barcode like 'X%'")
	public List<Map> findTestingBookIds();

	public BookEntity findByBookBarcode(String bookBarcode);
}
