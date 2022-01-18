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
