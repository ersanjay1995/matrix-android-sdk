package org.matrix.androidsdk.rest.model.login;


public class TokenLoginParams extends LoginParams {
    public String user;
    public String token;
    public String client_nonce;

    public TokenLoginParams() {
        type = "m.login.token";
    }
}