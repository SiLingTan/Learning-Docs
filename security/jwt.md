# JSON Web Tokens 

- Open standard (RFC 7519).
- Securely transfer information between any two bodies. 
- Digitally Signed - Information is verified and trusted.
- Useful for authentication and information exchange. 

It is ...
```
1. Compact
  - JWT can be send via URL, POST request, HTTP Header.
  - Fast transmission.
2. Self-contained
  - Contains information about the user.
  - Avoid query the database more than once (User does not have to login, just pass the token.).
```

## JWT structure
- Header.Payload.Signature (aaaaaa.bbbbbb.cccccc)
- Header and Payload is encoded in Base64Url.

### Header
- Example of header: 
```json
{
  "alg": "HS256",
  "typ": "JWT",
}
```

### Payload
- It contains claims. 
- Claims are user details or additional metadata.

- Example of payload: 
```
{
  "exp": 1561696840,  // Expires at: claim's expiry unix datetime. 
  "iat": 1561696810,  // Issue at: claim's issued unix datetime. 
  "sub": "3"          // Subject: user id. 
}
```

### Signature
```
HMACSHA256(
  base64UrlEncode(header) + "." +
  base64UrlEncode(payload), 
  secret                            // Secret: JWT secret stored in the backend server.
)
```

## Reference
- [Video with JWT Explained](https://www.youtube.com/watch?v=926mknSW9Lo)
- To see the values of JWT use `https://jwt.io/`

  


  
