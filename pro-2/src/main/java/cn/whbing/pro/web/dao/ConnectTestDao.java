package cn.whbing.pro.web.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ConnectTestDao {
    List<String> test();
}
