package com.pattern.chain.one;

import lombok.Data;

/**
 * @author: yhl
 * @DateTime: 2020/11/20 7:25
 * @Description:
 */
@Data
public class Member {
    private String loginName;
    private String loginPassword;
    private String roleName;

    public Member(String loginName, String loginPassword) {
        this.loginName = loginName;
        this.loginPassword = loginPassword;
    }
}
