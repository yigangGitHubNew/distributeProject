package org.spring.springboot.generator.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.spring.springboot.generator.mapper.CstpMmTplDetail;
import org.spring.springboot.generator.mapper.CstpMmTplDetailExample;
import org.spring.springboot.generator.mapper.CstpMmTplDetailKey;

public interface CstpMmTplDetailMapper {
    /**
     *
     * @mbggenerated 2018-09-21
     */
    int countByExample(CstpMmTplDetailExample example);

    /**
     *
     * @mbggenerated 2018-09-21
     */
    int deleteByExample(CstpMmTplDetailExample example);

    /**
     *
     * @mbggenerated 2018-09-21
     */
    int deleteByPrimaryKey(CstpMmTplDetailKey key);

    /**
     *
     * @mbggenerated 2018-09-21
     */
    int insert(CstpMmTplDetail record);

    /**
     *
     * @mbggenerated 2018-09-21
     */
    int insertSelective(CstpMmTplDetail record);

    /**
     *
     * @mbggenerated 2018-09-21
     */
    List<CstpMmTplDetail> selectByExample(CstpMmTplDetailExample example);

    /**
     *
     * @mbggenerated 2018-09-21
     */
    CstpMmTplDetail selectByPrimaryKey(CstpMmTplDetailKey key);

    /**
     *
     * @mbggenerated 2018-09-21
     */
    int updateByExampleSelective(@Param("record") CstpMmTplDetail record, @Param("example") CstpMmTplDetailExample example);

    /**
     *
     * @mbggenerated 2018-09-21
     */
    int updateByExample(@Param("record") CstpMmTplDetail record, @Param("example") CstpMmTplDetailExample example);

    /**
     *
     * @mbggenerated 2018-09-21
     */
    int updateByPrimaryKeySelective(CstpMmTplDetail record);

    /**
     *
     * @mbggenerated 2018-09-21
     */
    int updateByPrimaryKey(CstpMmTplDetail record);
}