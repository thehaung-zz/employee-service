package com.hhhvn.VO;

import com.hhhvn.enntity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseTemplateVO {
    private Employee employee;
    private Department department;
}
