package org.creating.www.daos;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.creating.www.beans.One;
@Mapper
public interface OneDao {
@Select("select * from one where ${colname} = #{value}")
@ResultType(One.class)
public One select(@Param("colname")String colname,@Param("value")String value);
}
