package com.example.bttuan2b2.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class studentEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    public String mahocsinh;

    @Column(name = "stt")
    public Integer stt;

    @Column(name = "hoten")
    public String ten;

    @Column(name = "truonghoc")
    public String truonghoc;

    @Column(name = "quanhuyen")
    public String quanhuyen;

    @Column(name = "lop")
    public String lop;

    @Column(name = "ngaysinh")
    public String ngaysinh;

    @Column(name="gioitinh")
    public String gioitinh;

    @Column(name = "noisinh")
    public String noisinh;

    @Column(name = "dantoc")
    public String dantoc;

    @Column(name = "hokhau")
    public String hokhau;

    @Column(name="dienthoai", length = 11)
    public String dienthoai;

    @Column(name = "diem")
    public Integer diem;

    @Column(name = "ghichu")
    public String ghichu;

    
}

