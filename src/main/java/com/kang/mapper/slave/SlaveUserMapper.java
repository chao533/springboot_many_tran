package com.kang.mapper.slave;

import java.util.List;
import java.util.Map;

public interface SlaveUserMapper {

	//@Select("select * from user")
	List<Map<String,Object>> getUserAll();
}
