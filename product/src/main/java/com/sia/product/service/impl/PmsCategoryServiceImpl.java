package com.sia.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sia.product.domain.PmsCategory;
import com.sia.product.service.PmsCategoryService;
import com.sia.product.mapper.PmsCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author 32156
* @description 针对表【pms_category(商品三级分类)】的数据库操作Service实现
* @createDate 2025-06-12 16:37:59
*/
@Service
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryMapper, PmsCategory>
    implements PmsCategoryService{

}




