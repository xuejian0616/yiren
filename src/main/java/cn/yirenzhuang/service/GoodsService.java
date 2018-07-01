package cn.yirenzhuang.service;

import cn.yirenzhuang.model.VO.GoodsListVO;

import java.util.List;

/**
 * @program: yirenzhuang
 * @Date: 2018/7/1 18:47
 * @Author: Mr.Deng
 * @Description:
 */
public interface GoodsService {

    /**
     * 根据分类id查询商品列表
     * @param categroyId
     * @return
     */
    public List<GoodsListVO> getGoodsByCategory(int categroyId);
}
