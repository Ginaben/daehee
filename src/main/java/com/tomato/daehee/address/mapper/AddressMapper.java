package com.tomato.daehee.address.mapper;

import com.tomato.daehee.address.vo.CustomerVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressMapper {

    int customerInfoInsert (CustomerVo customerVo) throws Exception;

}
