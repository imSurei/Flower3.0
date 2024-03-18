package com.sure.service.impl;

import com.sure.bean.member.Member;
import com.sure.dao.member.MemberDao;
import com.sure.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    public Member findMemberByAccount(String account) {
        return memberDao.findMemberByAccount(account);
    }

    public Member findMemberByAccountAndEmail(String account, String email) {
        return memberDao.findMemberByAccountAndEmail(account, email);
    }

    public Member findMemberByAccountAndPassword(String account, String password) {
        return memberDao.findMemberByAccountAndPassword(account, password);
    }

    public List<Member> findAllMembers() {
        return memberDao.findAllMembers();
    }

    public boolean insertMember(Member m) {
        memberDao.insertMember(m);
        return true;
    }

    public boolean updateMember(Member m) {
        memberDao.updateMember(m);
        return true;
    }

    public boolean deleteMember(int id) {
        memberDao.deleteMember(id);
        return true;
    }
}
