package com.sure.service;

import com.sure.bean.member.Member;
import com.sure.config.SpringConfig;
import com.sure.service.member.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void TestFindMemberByAccount() {
        Member admin = memberService.findMemberByAccount("member2");
        System.out.println(admin);
    }

    @Test
    public void TestFindMemberByAccountAndEmail() {
        Member member = memberService.findMemberByAccountAndEmail("member2", "1@q.com");
        System.out.println(member);
    }

    @Test
    public void TestFindMemberByAccountAndPassword() {
        Member member = memberService.findMemberByAccountAndPassword("member2", "member");
        System.out.println(member);
    }

    @Test
    public void TestFindAllMembers() {
        List<Member> allMembers = memberService.findAllMembers();
        System.out.println(allMembers);
    }

    @Test
    public void TestInsertMember() {
        Member member = new Member(18, "jack", "account", "password", "123@gmail.com", "2001-07-06", "f", "123", "0978654321", "member");
        System.out.println(memberService.insertMember(member));
    }

    @Test
    public void TestUpdateMember() {
        Member member = new Member(18, "jack123", "account", "pwd", "123@gmail.com", "2001-07-06", "f", "123", "0978654321", "member");
        System.out.println(memberService.updateMember(member));
    }

    @Test
    public void TestDeleteMember() {
        System.out.println(memberService.deleteMember(24));
    }
}
