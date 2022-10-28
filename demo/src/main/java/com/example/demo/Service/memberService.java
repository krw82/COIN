package com.example.demo.Service;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.MemberDao;
import com.example.demo.Vo.member;


@Service("Member")

public class memberService  implements IMMemberService {
	
	@Resource
	private MemberDao Dao;

	@Override
	public member selectMember(String ID) { 
		// TODO Auto-generated method stub
		return Dao.selectMember(ID);
	}

}
