package com.hhhvn.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {

    private long departmentId;

    private String departmentName;

    private String departmentAddress;

    private String departmentCode;
}
