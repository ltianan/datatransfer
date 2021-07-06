package cn.ltianan.study.dto;

import java.io.Serializable;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@SqlResultSetMapping(
name = "findRandomNlcData",
   classes = {
      @ConstructorResult(
          targetClass = cn.ltianan.study.dto.NlcbibDTO.class,
          columns = {
        		  @ColumnResult(name = "id", type = String.class),  
        		  @ColumnResult( name = "sysid", type = String.class),
        		  @ColumnResult( name = "cnmarc", type = String.class)
          }
      )
   } 
)

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NlcbibDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String sysid;
	private String cnmarc;
}
