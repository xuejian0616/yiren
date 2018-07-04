package cn.yirenzhuang.service.impl;

import cn.yirenzhuang.mapper.GoodsDescMapper;
import cn.yirenzhuang.mapper.GoodsMapper;
import cn.yirenzhuang.mapper.GoodsSpecMapper;
import cn.yirenzhuang.model.TBGoodsDesc;
import cn.yirenzhuang.model.VO.GoodsListVO;
import cn.yirenzhuang.model.VO.GoodsSpecListVO;
import cn.yirenzhuang.model.VO.GoodsSpecVO;
import cn.yirenzhuang.model.VO.GoodsVO;
import cn.yirenzhuang.service.GoodsService;
import io.swagger.annotations.ApiModelProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GoodsServiceImpl implements GoodsService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    GoodsMapper goodsMapper;

    @Autowired
    GoodsSpecMapper goodsParamMapper;

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
     * 根据商品id查询商品规格列表
     * @param goodsId
     * @return 规格列表
     */
    @Override
    public GoodsSpecListVO getGoodsSpec(int goodsId){
        GoodsSpecListVO goodsSpecListVO = new GoodsSpecListVO();
        List<GoodsSpecVO> goodsSpecList = goodsParamMapper.getGoodsSpec(goodsId);

        List<Map<String,String>> norms = new ArrayList<>();
        List<Map<String,String>> size = new ArrayList<>();
        Set<String> addSpce = new HashSet<>();
        for(GoodsSpecVO goodsSpec:goodsSpecList){

            if(!addSpce.contains(goodsSpec.getNorm())){
                Map<String,String> normsMap = new HashMap<>();
                normsMap.put("norm",goodsSpec.getNorm());
                normsMap.put("isSelect","");
                norms.add(normsMap);
                addSpce.add(goodsSpec.getNorm());
            }

            if(!addSpce.contains(goodsSpec.getSize())){
                Map<String,String> sizeMap = new HashMap<>();
                sizeMap.put("size",goodsSpec.getSize());
                sizeMap.put("isSelect","");
                size.add(sizeMap);
                addSpce.add(goodsSpec.getSize());
            }
        }
        goodsSpecListVO.setNorms(norms);
        goodsSpecListVO.setSizes(size);

        goodsSpecListVO.setGoodsSpec(goodsSpecList);
        return goodsSpecListVO;
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
//            List<GoodsSpecVO> goodsSpec = goodsParamMapper.getGoodsSpec(goodsId);
//            goodsVO.setGoodsSpec(goodsSpec);

            List<String> imges = new ArrayList<>();
            if(!Objects.isNull(goodsVO.getPicOne())){
                imges.add(goodsVO.getPicOne());
            }
            if(!Objects.isNull(goodsVO.getPicTwo())){
                imges.add(goodsVO.getPicTwo());
            }
            if(!Objects.isNull(goodsVO.getPicThree())){
                imges.add(goodsVO.getPicThree());
            }
            if(!Objects.isNull(goodsVO.getPicFour())){
                imges.add(goodsVO.getPicFour());
            }
            if(!Objects.isNull(goodsVO.getPicFive())){
                imges.add(goodsVO.getPicFive());
            }
            goodsVO.setImages(imges);

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