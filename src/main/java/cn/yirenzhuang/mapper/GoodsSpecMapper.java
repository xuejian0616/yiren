package cn.yirenzhuang.mapper;

import cn.yirenzhuang.common.mapper.BaseMapper;
import cn.yirenzhuang.model.TBGoodsSpec;
import cn.yirenzhuang.model.VO.GoodsSpecVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: xuhao
 *
 * @Date：Created on 2018/7/1 18:30.
 */
@Repository
public interface GoodsSpecMapper extends BaseMapper<TBGoodsSpec> {


    /**
     * 根据商品id查询商品规格列表
     * @param goodsId
     * @return 商品规格列表
     */
    public List<GoodsSpecVO> getGoodsSpec(@Param("goodsId") int goodsId);
}