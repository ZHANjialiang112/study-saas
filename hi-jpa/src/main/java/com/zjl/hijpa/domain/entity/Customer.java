package com.zjl.hijpa.domain.entity;

import com.vladmihalcea.hibernate.type.json.JsonStringType;
import com.zjl.hijpa.common.model.AbstratEntity;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;


/**
 * @author wenman
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name= "customer")
@TypeDef(name = "json", typeClass = JsonStringType.class)
public class Customer extends AbstratEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "tenantCode")
    private String tenantCode;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;


    @Column(name = "data")
    @Type(type = "json")
    @Convert(disableConversion = true)
    private List<String> data;

}
