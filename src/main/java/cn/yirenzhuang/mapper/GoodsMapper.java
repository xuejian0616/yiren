package cn.yirenzhuang.mapper;

import cn.yirenzhuang.common.mapper.BaseMapper;
import cn.yirenzhuang.model.TBGoods;
import cn.yirenzhuang.model.VO.GoodsListVO;
import cn.yirenzhuang.model.VO.GoodsVO;
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
     * @return 商品列表
     */
    public List<GoodsListVO> getGoodsByCategory(@Param("categroyId") int categroyId);


    /**
     * 根据商品id获取商品详情
     * @param goodsId
     * @return 商品详情
     */
    public GoodsVO getGoodsInfo(@Param("goodsId") int goodsId);

    /**
     * 获取销量前十的商品列表
     * @return 商品列表
     */
    public List<GoodsListVO> getSalesGoods();

    /**
     * 获取上架前十的商品列表
     * @return 商品列表
     */
    public List<GoodsListVO> getNewGoods();

}