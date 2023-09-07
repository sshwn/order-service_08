package com.example.orderservice.dto;

import lombok.Builder;
import lombok.Data;

/**
 * mariaDb 컬럼과 일치 (실제로 전달되는 값)
 */
@Data
@Builder
public class Payload {
    private String order_id;
    private String user_id;
    private String product_id;
    private int qty;
    private int unit_price;
    private int total_price;
}
