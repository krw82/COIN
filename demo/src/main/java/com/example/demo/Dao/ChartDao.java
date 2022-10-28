package com.example.demo.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Vo.MarketCode;

@Mapper
public interface ChartDao {
    public ChartDao setMarketCode(List<MarketCode> list);
}
