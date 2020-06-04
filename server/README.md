# org.openapitools.server - Kotlin Server library for WhoseHouse

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

Generated by OpenAPI Generator 4.3.1.

## Requires

* Kotlin 1.3.21
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Running

The server builds as a fat jar with a main entrypoint. To start the service, run `java -jar ./build/libs/kotlin-server.jar`.

You may also run in docker:

```
docker build -t kotlin-server .
docker run -p 8080:8080 kotlin-server
```

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs (see ktor documentation for more info).
* ~Supports collection formats for query parameters: csv, tsv, ssv, pipes.~
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost:2608*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**groups**](docs/DefaultApi.md#groups) | **GET** /{userId}/groups | Get a list of all groups of logged in user
*DefaultApi* | [**login**](docs/DefaultApi.md#login) | **POST** /login | Login
*DefaultApi* | [**logout**](docs/DefaultApi.md#logout) | **POST** /logout | Logout


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.models.LoginData](docs/LoginData.md)
 - [org.openapitools.server.models.LoginResponse](docs/LoginResponse.md)
 - [org.openapitools.server.models.NeubauerPermission](docs/NeubauerPermission.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="bearerAuth"></a>
### bearerAuth

- **Type**: API key
- **API key parameter name**: x-auth-token
- **Location**: HTTP header
