package com.my.blog.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hjy
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
}
