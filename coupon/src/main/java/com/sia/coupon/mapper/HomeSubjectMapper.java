package com.sia.coupon.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sia.coupon.domain.HomeSubject;

/**
 * 首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】Mapper接口
 *
 * @author lsy
 * @date 2025-07-31
 */
public interface HomeSubjectMapper extends BaseMapper<HomeSubject> {
    /**
     * 查询首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息�?
     *
     * @param id 首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】主�?
     * @return 首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息�?
     */
    HomeSubject selectHomeSubjectById(Long id);

    /**
     * 查询首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】列�?
     *
     * @param homeSubject 首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息�?
     * @return 首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】集�?
     */
    public List<HomeSubject> selectHomeSubjectList(HomeSubject homeSubject);

    /**
     * 新增首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息�?
     *
     * @param homeSubject 首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息�?
     * @return 结果
     */
    public int insertHomeSubject(HomeSubject homeSubject);

    /**
     * 修改首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息�?
     *
     * @param homeSubject 首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息�?
     * @return 结果
     */
    public int updateHomeSubject(HomeSubject homeSubject);

    /**
     * 删除首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息�?
     *
     * @param id 首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】主�?
     * @return 结果
     */
    public int deleteHomeSubjectById(Long id);

    /**
     * 批量删除首页专题【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息�?
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHomeSubjectByIds(Long[] ids);
}
