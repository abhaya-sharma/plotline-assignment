Plotline Assignment

Problem Statement
    We are given a sample API response and asked to optimise on size of response being sent out. This can be handled by
    using Gzip compression and ProtoBuf to reduce key value mapping data overhead .

Steps to build and run project -
 1) use command `mvn clean install` to build the project  
 2) run the application on IDE  



API documentation :

1) (GET) api/v1/fetch
expected response -
    {
        "message": "",
        "data": "CgRhYmNkCgRhYmNkEgRhYmNkEgRhYmNkGgRhYmNkGgRhYmNkIgRhYmNkIgRhYmNkKgRhYmNkKgRhYmNkMgRhYmNkMgRhYmNkOAFCBGFiY2RCBGFiY2RKBGFiY2RKBGFiY2RSBGFiY2RYe2ABaAGCAQRhYmNkggEEYWJjZIoBBGFiY2SKAQRhYmNk",
        "status": "success",
        "statusCode": 200
    }
   (Here the data is byte serialised using protoBuf)