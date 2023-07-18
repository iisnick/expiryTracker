package com.app.expirytracker.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Table: tbl_role
 */
@Data
public class TblRole  implements Serializable {
    /**
     * Column: id
     * Type: int4
     */
    private Integer id;

    /**
     * Column: name
     * Type: varchar(100)
     */
    private String name;
}