package com.zjl.hijpa.common.model;


import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstratEntity {

    @CreatedDate
    @Column(name ="createAt",updatable = false)
    private LocalDateTime createAt;

    @CreatedBy
    @Column(name = "createBy",updatable = false)
    private  String createBy;

    @LastModifiedBy
    private String updateBy;

    @LastModifiedDate
    private LocalDateTime updateAt;
}
