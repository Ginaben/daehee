package com.tomato.daehee.address.service;

import com.tomato.daehee.address.mapper.AddressMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@AllArgsConstructor
@Service
@Slf4j
public class AddressServiceImpl implements AddressService {

    private final AddressMapper addressMapper;

}
