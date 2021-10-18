package com.sp.test.user;

import org.springframework.stereotype.Repository;

@Repository
public interface IMemberDAO {
 public int memberProc(MemberDTO memberDTO);
}
