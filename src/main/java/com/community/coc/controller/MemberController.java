package com.community.coc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.community.coc.data.Member;
import com.community.coc.repository.MemberRepository;

import java.util.List;


@RestController
@RequestMapping("/members")
public class MemberController 
{
    @Autowired
    private MemberRepository memberRepository;

    @PostMapping
    public Member addMember(@RequestBody Member member) {
        return memberRepository.save(member);
    }

    @GetMapping
    public List<Member> getMembers() {
        return memberRepository.findAll();
    }
    
}