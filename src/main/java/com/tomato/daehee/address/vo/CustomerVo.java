package com.tomato.daehee.address.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerVo {

    int customer_idx;
    String customer_nm;
    String customer_mobile;
    String customer_addr;
    String customer_addr_detail;
    String customer_zipcode;
    String customer_comment;
    String regist_date;
    String update_date;
}
