package com.my.blog.service.impl;

import com.my.blog.entity.Blog;
import com.my.blog.mapper.BlogMapper;
import com.my.blog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 04191502
 * @since 2022-04-27
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
