package com.tomato.daehee.address.service;

import com.tomato.daehee.address.mapper.AddressMapper;
import com.tomato.daehee.address.vo.CustomerReqVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class AddressServiceImpl implements AddressService {

    private final AddressMapper addressMapper;

    @Override
    public int customerInfoInsert (CustomerReqVo customerReqVo) throws Exception {
        return addressMapper.customerInfoInsert(customerReqVo);
    }

}
