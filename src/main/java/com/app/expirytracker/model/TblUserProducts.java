package com.app.expirytracker.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Table: tbl_user_products
 */
@Data
public class TblUserProducts implements Serializable {
    /**
     * Column: id
     * Type: int4
     */
    private Integer id;

    /**
     * Column: user_id
     * Type: int4
     */
    private Integer userId;

    /**
     * Column: prod_id
     * Type: int4
     */
    private Integer prodId;

    /**
     * Column: expire_time
     * Type: timetz
     */
    private Date expireTime;

    /**
     * Column: quantity
     * Type: int4
     */
    private Integer quantity;

    /**
     * Column: created_by
     * Type: int4
     */
    private Integer createdBy;

    /**
     * Column: create_time
     * Type: timetz
     * Default value: CURRENT_TIMESTAMP
     */
    private Date createTime;

    /**
     * Column: last_mod_by
     * Type: int4
     */
    private Integer lastModBy;

    /**
     * Column: last_mod_time
     * Type: timetz
     * Default value: CURRENT_TIMESTAMP
     */
    private Date lastModTime;

    /**
     * Column: status
     * Type: int4
     * Default value: 0
     */
    private Integer status;
}