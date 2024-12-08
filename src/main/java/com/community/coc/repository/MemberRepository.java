package com.community.coc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.community.coc.data.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
