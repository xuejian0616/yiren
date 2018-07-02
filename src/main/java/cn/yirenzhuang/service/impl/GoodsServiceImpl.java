package cn.yirenzhuang.service.impl;

import cn.yirenzhuang.mapper.GoodsDescMapper;
import cn.yirenzhuang.mapper.GoodsMapper;
import cn.yirenzhuang.mapper.GoodsParamMapper;
import cn.yirenzhuang.model.TBGoods;
import cn.yirenzhuang.model.TBGoodsDesc;
import cn.yirenzhuang.model.VO.GoodsListVO;
import cn.yirenzhuang.model.VO.GoodsParamVO;
import cn.yirenzhuang.model.VO.GoodsVO;
import cn.yirenzhuang.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class GoodsServiceImpl implements GoodsService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    GoodsParamMapper goodsParamMapper;

    @Autowired
    GoodsDescMapper goodsDescMapper;
    /**
     * 根据分类id查询商品列表
     * @param categroyId
     * @return
     */
    @Override
    public List<GoodsListVO> getGoodsByCategory(int categroyId){
        return goodsMapper.getGoodsByCategory(categroyId);
    }

    /**
     * 根据商品id获取商品详情
     * @param goodsId
     * @return 商品详情
     */
    @Override
    public GoodsVO getGoodsInfo(int goodsId){
        GoodsVO goodsVO = goodsMapper.getGoodsInfo(goodsId);

        if(!Objects.isNull(goodsVO)){
            List<GoodsParamVO> goodsParams = goodsParamMapper.getGoodsParam(goodsId);
            goodsVO.setGoodsParams(goodsParams);

            TBGoodsDesc goodsDesc = new TBGoodsDesc();
            goodsDesc.setGoodsId(goodsId);
            TBGoodsDesc tbGoodsDesc = goodsDescMapper.selectOne(goodsDesc);
            if(!Objects.isNull(tbGoodsDesc)){
                goodsVO.setGoodsDesc(tbGoodsDesc.getGoodsDesc());
            }
        }

        return goodsVO;
    }

    /**
     * 获取销量前十的商品列表
     * @return 商品列表
     */
    @Override
    public List<GoodsListVO> getSalesGoods(){
        return goodsMapper.getSalesGoods();
    }

    /**
     * 获取销量前十的商品列表
     * @return 商品列表
     */
    @Override
    public List<GoodsListVO> getNewGoods(){
        return goodsMapper.getNewGoods();
    }


}