package main

import (
	"log"
	"net/http"

	"github.com/gorilla/mux"
)

func HandlerRouting() {
	r := mux.NewRouter()
	r.HandleFunc("/user", createUser).Methods("POST")
	r.HandleFunc("/users", getUsers).Methods("GET")
	r.HandleFunc("/user/{userId}", getUserById).Methods("GET")
	r.HandleFunc("/user/{userId}", updateUser).Methods("PUT")
	r.HandleFunc("/user/{userId}", deleteUser).Methods("DELETE")
	log.Fatal(http.ListenAndServe(":8081", r))
}
