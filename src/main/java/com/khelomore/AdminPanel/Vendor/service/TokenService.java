package com.khelomore.AdminPanel.Vendor.service;


import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;


@Component
public class TokenService
{

	public static final String TOKEN_SECRET = "s4T2zOIWHMM1sxq";

  public String createToken(String phone) {
      
          Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
          String token = JWT.create()
                  .withClaim("email",phone).sign(algorithm);
          return token;
      
      
     
          
  }
  
  
  

  public String getUserIdFromToken(String token) {
      try {
          Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
          JWTVerifier verifier = JWT.require(algorithm)
                  .build();
          DecodedJWT jwt = verifier.verify(token);
          return jwt.getClaim("email").asString();
      } catch (JWTVerificationException exception) {
          exception.printStackTrace();
          //log Token Verification Failed
          return null;
      }
  }
}