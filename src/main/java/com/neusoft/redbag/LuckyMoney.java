package com.neusoft.redbag;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * LuckyMoney是与数据库中字段一一对应的实体类
 */
@Entity
@Data
@NoArgsConstructor
//lombok插件不用自己写写一些方法
public class LuckyMoney {
    //@Entity指定该类是实体类，@Id代表主键

    @Id
    //自增长
    @GeneratedValue
    private Integer id;
    //红包金额
    private BigDecimal money;
    //发红包人
    private String producer;
    //收红包人
    private String consumer;
}
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public BigDecimal getMoney() {
//        return money;
//    }
//
//    public void setMoney(BigDecimal money) {
//        this.money = money;
//    }
//
//    public String getProducer() {
//        return producer;
//    }
//
//    public void setProducer(String producer) {
//        this.producer = producer;
//    }
//
//    public String getConsumer() {
//        return consumer;
//    }
//
//    public void setConsumer(String consumer) {
//        this.consumer = consumer;
//    }

