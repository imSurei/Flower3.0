package com.sure.controller.member;

import com.sure.bean.member.Member;
import com.sure.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/{account}")
    public Member findMemberByAccount(@PathVariable String account) {
        return memberService.findMemberByAccount(account);
    }

    @GetMapping("/{account}/{email}")
    public Member findMemberByAccountAndEmail(@PathVariable String account, @PathVariable String email) {
        return memberService.findMemberByAccountAndEmail(account, email);
    }

    @GetMapping("/{account}/{password}")
    public Member findMemberByAccountAndPassword(@PathVariable String account, @PathVariable String password) {
        return memberService.findMemberByAccountAndPassword(account, password);
    }

    @GetMapping
    public List<Member> findAllMembers() {
        return memberService.findAllMembers();
    }

    @PostMapping
    public boolean insertMember(@RequestBody Member m) {
        return memberService.insertMember(m);
    }

    @PutMapping
    public boolean updateMember(@RequestBody Member m) {
        return memberService.updateMember(m);
    }

    @DeleteMapping("/{id}")
    public boolean deleteMember(int id) {
        return memberService.deleteMember(id);
    }

}
