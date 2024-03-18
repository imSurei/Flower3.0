package com.sure.service.member;

import com.sure.bean.member.Member;

import java.util.List;

public interface MemberService {
    // Read
    Member findMemberByAccount(String account);
    Member findMemberByAccountAndEmail(String account,String email);
    Member findMemberByAccountAndPassword(String account,String password);

    // Read All
    List<Member> findAllMembers();

    // Create
    boolean insertMember(Member m);

    // Update
    boolean updateMember(Member m);

    // Delete
    boolean deleteMember(int id);
}
