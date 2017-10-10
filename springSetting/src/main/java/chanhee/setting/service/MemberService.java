package chanhee.setting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chanhee.setting.dao.MemberDao;
import chanhee.setting.domain.Member;

@Service
public class MemberService {

	private MemberDao memberDao;
	
	@Autowired
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public List<Member> getAll() {
		return memberDao.selectAll();
	}
}
