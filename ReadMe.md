# Getting Started

```./gradlew build```

```./gradlew bootRun```


or 


```docker build -t gradle-demo .```

```docker run -p 8080:8080 gradle-demo```



http://localhost:8080/test



### CI/CD using GitHub Actions

This GitHub Actions workflow (on main branch):
 - sets up an environment with JDK 11, 
 - builds a Java application using Gradle, 
 - creates a JAR file, 
 - uploads it as an artifact, 
 - retrieves the latest Docker image version from the private GitHub Container Registry, 
 - increments the version based on a VARIABLE on GITHUB, 
 - then builds and pushes a Docker image to the private GitHub Container Registry.

 ### Preconditions
- define DOCKER_PAT as a secret to access GitHub Container Registry
- define SEM_VER_INCREMENT as a variable with setting one of the value (MAJOR, MINOR or PATCH)


Resources:
1. https://docs.github.com/en/actions/using-jobs/defining-outputs-for-jobs
2. https://github.com/actions/upload-artifact
3. https://github.com/actions/download-artifact
4. [GitHub Actions Tutorial - Basic Concepts and CI/CD Pipeline with Docker](https://www.youtube.com/watch?v=R8_veQiYBjI)
