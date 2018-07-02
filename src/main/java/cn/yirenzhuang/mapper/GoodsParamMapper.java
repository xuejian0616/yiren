package cn.yirenzhuang.mapper;

import cn.yirenzhuang.common.mapper.BaseMapper;
import cn.yirenzhuang.model.TBGoodsParam;
import cn.yirenzhuang.model.VO.GoodsListVO;
import cn.yirenzhuang.model.VO.GoodsParamVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: xuhao
 *
 * @Date：Created on 2018/7/1 18:30.
 */
@Repository
public interface GoodsParamMapper extends BaseMapper<TBGoodsParam> {


    /**
     * 根据商品id查询商品规格列表
     * @param goodsId
     * @return 商品规格列表
     */
    public List<GoodsParamVO> getGoodsParam(@Param("goodsId") int goodsId);
}