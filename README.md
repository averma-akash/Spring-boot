# Spring-boot-oauth2

OAuth 2 is an authorization method to provide access to protected resources over the HTTP protocol. oauth2 enables a third-party application to obtain limited access to an HTTP service –
either on behalf of a resource owner by orchestrating an approval interaction between the resource owner and the HTTP service
or by allowing the third-party application to obtain access on its own behalf.

OAuth defines four roles –

Resource Owner – The user of the application.
Client – the application (user is using) which require access to user data on the resource server.
Resource Server – store user’s data and http services which can return user data to authenticated clients.
Authorization Server – responsible for authenticating user’s identity and gives an authorization token. This token is accepted by resource server and validate your identity.

Resource / Authorization Server – The resource server hosts the protected user accounts, and the authorization server verifies the identity of the user then issues access tokens to the application.

ClientDetailsServiceConfigurer is used to define an in-memory or JDBC implementation of the client details service. we have used in-memory implementation. It has the following important attributes:

clientId – (required) the client id.
secret – (required for trusted clients) the client secret, if any.
scope – The scope to which the client is limited. If the scope is undefined or empty (the default), the client is not limited by scope.
authorizedGrantTypes – Grant types that are authorized for the client to use. The default value is empty.
authorities – Authorities that are granted to the client (regular Spring Security authorities).
redirectUris – redirects the user-agent to the client’s redirection endpoint. It must be an absolute URL.

http://localhost:8080/oauth/authorize?client_id=clientApp&response_type=code&scope=read_profile_info
