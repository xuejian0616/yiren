package cn.yirenzhuang.service;

import cn.yirenzhuang.model.VO.GoodsCategoryVO;

import java.util.List;

/**
 * @program: yirenzhuang
 * @Date: 2018/7/1 18:49
 * @Author: Mr.Deng
 * @Description:
 */
public interface GoodsCategoryService {

    /**
     * 获取服装的二级分类
     * @return  List<GoodsCategoryVO>
     */
    public List<GoodsCategoryVO> getGoodsSubCategory();
}
