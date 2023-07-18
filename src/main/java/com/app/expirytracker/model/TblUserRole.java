package com.app.expirytracker.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Table: tbl_user_role
 */
@Data
public class TblUserRole  implements Serializable {
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
     * Column: role_id
     * Type: int4
     */
    private Integer roleId;
}