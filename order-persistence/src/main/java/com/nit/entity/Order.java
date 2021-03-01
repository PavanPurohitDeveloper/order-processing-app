package com.nit.entity;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ord_id")
    private Integer ordId;

    @Column(name = "ord_desc")
    private String ordDesc;
//
//    @Column(name = "ord_date")
//    private Date ordDate;

    @Column(name = "purch_amt")
    private Double purchAmt;

    @Column(name = "ord_status")
    private String ordStatus;

    @Column(name = "created_by")
    private String createdBy;


//    @Column(name = "created_dt")
//    private LocalDateTime createdDt;
//
//    //@Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "created_dt")
//    private Timestamp createdDt;

   /* @Column(name = "created_dt")
    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm", iso = DateTimeFormat.ISO.DATE_TIME)
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime createdDt;*/
}
