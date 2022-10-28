package com.example.demo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Vo.member;

@Mapper
public interface MemberDao {
	public  member selectMember(String ID);
	
}
