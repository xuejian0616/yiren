package cn.yirenzhuang.mapper;

import cn.yirenzhuang.common.mapper.BaseMapper;
import cn.yirenzhuang.model.TBGoods;
import cn.yirenzhuang.model.VO.GoodsListVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: xuhao
 *
 * @Date：Created on 2018/7/1 18:30.
 */
@Repository
public interface GoodsMapper extends BaseMapper<TBGoods> {

    /**
     * 根据分类id查询商品列表
     * @param categroyId
     * @return
     */
    public List<GoodsListVO> getGoodsByCategory(@Param("categroyId")int categroyId);
}