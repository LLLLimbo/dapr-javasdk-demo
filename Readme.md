# Introduction

This is a simple example of an inter-service call.

`greeting-service` will call the `/hello` interface of `hello-service` and return the result of the call to the user interface.



## Pre-requisites

- Installed Kubernetes cluster
- Initialising Dapr on Kubernetes
- Helm



## Deploy

1. `cd greeting-service`
2. `docker build -t limbo/greeting-service:latest .`
3. `helm install greeting-service greeting-service`
4. `cd ../greeting-service`
5. `docker build -t limbo/hello-service:latest .`
6. `helm install hello-service hello-service`
7. `kubectl get pods -A -w` Waiting for Pod to be in `Running` state
8. `curl http://localhost:8080/greet` and you will see `Hello!`

