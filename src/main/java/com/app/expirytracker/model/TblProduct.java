package com.app.expirytracker.model;

import java.util.Date;
import lombok.Data;

/**
 * Table: tbl_product
 */
@Data
public class TblProduct {
    /**
     * Column: id
     * Type: int4
     */
    private Integer id;

    /**
     * Column: name
     * Type: varchar(2147483647)
     */
    private String name;

    /**
     * Column: unit
     * Type: varchar(2147483647)
     */
    private String unit;

    /**
     * Column: dsc
     * Type: varchar(2147483647)
     */
    private String dsc;

    /**
     * Column: prd_typ_cod
     * Type: varchar(2147483647)
     */
    private String prdTypCod;

    /**
     * Column: create_time
     * Type: timestamptz
     * Default value: CURRENT_TIMESTAMP
     */
    private Date createTime;

    /**
     * Column: created_by
     * Type: int4
     */
    private Integer createdBy;

    /**
     * Column: last_mod_time
     * Type: timestamptz
     * Default value: CURRENT_TIMESTAMP
     */
    private Date lastModTime;

    /**
     * Column: last_mod_by
     * Type: int4
     */
    private Integer lastModBy;

    /**
     * Column: status
     * Type: int4
     * Default value: 0
     */
    private Integer status;
}