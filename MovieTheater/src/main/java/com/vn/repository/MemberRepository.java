package com.vn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vn.models.Member;

public interface MemberRepository extends JpaRepository<Member, String>{

}
