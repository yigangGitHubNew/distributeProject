package org.spring.springboot.generator.mapper;

import java.math.BigDecimal;

public class CstpMmTplDetailKey {
    /**null*/
    private String iCode;

    /**null*/
    private BigDecimal tplId;

    /**
     * null
     * @return I_CODE null
     */
    public String getiCode() {
        return iCode;
    }

    /**
     * null
     * @param iCode null
     */
    public void setiCode(String iCode) {
        this.iCode = iCode == null ? null : iCode.trim();
    }

    /**
     * null
     * @return TPL_ID null
     */
    public BigDecimal getTplId() {
        return tplId;
    }

    /**
     * null
     * @param tplId null
     */
    public void setTplId(BigDecimal tplId) {
        this.tplId = tplId;
    }
}