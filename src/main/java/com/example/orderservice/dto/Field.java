package com.example.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 필드 정보
 * 데이터를 저장하기 위해서 사용할 필드
 */
@Data
@AllArgsConstructor
public class Field {
    private String type;
    private boolean optional;
    private String field;
}
