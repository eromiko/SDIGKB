package com.sdig.kb.mapper;

import com.sdig.kb.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    //总人数
    @Select("select name,total from SD_persontotal")
    List<User> userAll();

    //2.直属企业人数
    @Select("select name,total from SD_zsqytotal")
    List<User> zsqyAll();

    //3.退休人数
    @Select("select name,total from SD_txtotal")
    List<User> txAll();

    //4.离职人数
    @Select("select name,total from SD_lztotal")
    List<User> lzAll();

    //5.性别
    @Select("select name,total from SD_xbtotal")
    List<User> xbAll();

    //6.人员类别
    @Select("select name,total from SD_rylbtotal")
    List<User> rylbAll();

    //7.职级
    @Select("select name,total from SD_zjtotal")
    List<User> zjAll();

    //8.学历
    @Select("select name,total from SD_xltotal")
    List<User> xlAll();

    //9.职称
    @Select("select name,total from SD_zctotal")
    List<User> zcAll();

    //10.年龄
    @Select("select name,total from SD_nltotal")
    List<User> nlAll();
}
