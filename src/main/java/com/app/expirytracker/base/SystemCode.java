package com.app.expirytracker.base;

public enum SystemCode {
    /**
     * OK
     */
    OK(200, "Success"),
    /**
     * AccessTokenError
     */
    AccessTokenError(400, "AccessTokenError"),
    /**
     * UNAUTHORIZED
     */
    UNAUTHORIZED(401, "Unauthorized"),
    /**
     * UNAUTHORIZED
     */
    AuthError(402, "Username or password is wrong"),
    /**
     * InnerError
     */
    InnerError(500, "Internal Error"),
    /**
     * ParameterValidError
     */
    ParameterValidError(501, "Parameter Valid Error"),

    /**
     * AccessDenied
     */
    AccessDenied(502, "Access Denied");

    /**
     * The Code.
     */
    final int code;
    /**
     * The Message.
     */
    final String message;

    SystemCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }
}
