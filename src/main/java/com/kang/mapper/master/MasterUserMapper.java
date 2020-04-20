package com.kang.mapper.master;

import java.util.List;
import java.util.Map;

public interface MasterUserMapper {

	//@Select("select * from tb_user")
	List<Map<String,Object>> getUserAll();
}
