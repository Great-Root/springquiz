package com.care.member.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.member.dto.MemberDTO;

@Repository
public class MemberDAO {
	
	ArrayList<MemberDTO> list = new ArrayList<>();
	
	public boolean insert(MemberDTO dto) {
		return list.add(dto);
	}
	
	public ArrayList<MemberDTO> getList(){
		return list;
	}
	
}
