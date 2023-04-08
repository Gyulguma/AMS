package com.ams.amsbackend.util;

import lombok.Getter;

@Getter
public enum BaseResponseStatus {
    SUCCESS(true, 1000, "��û�� �����Ͽ����ϴ�."),
    /*
     * 2000: Log-in, Sign-up
     * */
    DUPLICATE_NICKNAME(false, 2000, "�г����� �ߺ��Ǿ����ϴ�."),
    DUPLICATE_EMAIL(false, 2001, "�̸����� �ߺ��Ǿ����ϴ�."),
    EMPTY_JWT(false, 2002, "JWT�� �Է����ּ���."),
    INVALID_JWT(false, 2003, "��ȿ���� ���� JWT�Դϴ�."),
    POST_USERS_EMPTY_NICKNAME(false, 2004, "���̵� �Է����ּ���."),
    POST_USERS_EMPTY_PASSWORD(false, 2005, "��й�ȣ�� �Է����ּ���."),
    POST_USERS_INVALID_PASSWORD(false, 2006, "��й�ȣ�� Ʋ�Ƚ��ϴ�."),
    FAILED_TO_LOGIN(false, 2007, "���� ���̵��̰ų� ��й�ȣ�� Ʋ�Ƚ��ϴ�."),
    /*
     * 2100: Social
     */
    SOCIAL(false, 2101, "�Ҽȷ� �α����� ������ �̸��� �Դϴ�."),
    NOT_SOCIAL(false, 2102, "�Ҽ��� �α������� ������ �̸����Դϴ�."),
    /*
     * 4000: [POST]
     * */
    POST_USERS_EMPTY(false, 4000, "���� ���� �Է����ּ���."),
    POST_USERS_INVALID_EMAIL(false, 4001, "�̸��� ����� ���� �ʽ��ϴ�."),
    POST_USERS_INVALID_PWD(false, 4002, "��й�ȣ ����� ���� �ʽ��ϴ�."),
    /*
     * 5000: database error
     * */
    PASSWORD_ENCRYPTION_ERROR(false, 5001, "��й�ȣ ��ȣȭ�� �����߽��ϴ�."),
    DATABASE_ERROR(false, 5002, "�����ͺ��̽� ���ῡ �����Ͽ����ϴ�."),
    /*
     * 7000 : PATCH
     * */
    PASSWORD_EQUALS_NEWPASSWORD(false, 7000, "���� ��й�ȣ�δ� ���ο� ��й�ȣ�� ������ �� �����ϴ�."),
    /*
     * 8000 : delete
     * */
    DELETE_USER_ERROR(false, 8013, "ȸ�� ������ �����ϴ� ���� ������ �߻��߽��ϴ�."),

    /*
     * 9500 : jwt
     * */

    WRONG_JWT_SIGN_TOKEN(false, 9500, "�߸��� JWT �����Դϴ�."),
    EXPIRED_JWT_TOKEN(false, 9501, "����� JWT ��ū �Դϴ�."),
    UNSUPPORTED_JWT_TOKEN(false, 9502, "�������� �ʴ� JWT ��ū�Դϴ�."),
    WRONG_JWT_TOKEN(false, 9503, "JWT ��ū�� �߸��Ǿ����ϴ�."),
    NULL_JWT(false,9504, "JWT�� ���� �����ϴ�."),
    INVALID_JWT_TOKEN(false, 9505, "Refresh Token �� ��ȿ���� �ʽ��ϴ�."),
    NOT_SAME_USER_INFO(false, 9506, "��ū�� ���� ������ ��ġ���� �ʽ��ϴ�."),
    LOGOUT_USER(false, 9507, "�α׾ƿ��� ������Դϴ�.")
    ;


    private final boolean isSuccess;
    private final int code;
    private final String message;

    private BaseResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}