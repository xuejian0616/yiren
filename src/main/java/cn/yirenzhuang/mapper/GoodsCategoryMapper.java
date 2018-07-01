package cn.yirenzhuang.mapper;

import cn.yirenzhuang.common.mapper.BaseMapper;
import cn.yirenzhuang.model.TBGoodsCategory;
import cn.yirenzhuang.model.VO.GoodsCategoryVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: xuhao
 *
 * @Date：Created on 2018/7/1 18:30.
 */
@Repository
public interface GoodsCategoryMapper extends BaseMapper<TBGoodsCategory> {

    /**
     * 根据商品的二级分类获取下级分类
     * @return  List<GoodsCategoryVO>
     */
    public List<GoodsCategoryVO> getGoodsSubCategory(@Param("parentId") int parentId);


}