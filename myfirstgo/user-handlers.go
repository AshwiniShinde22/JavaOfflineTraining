package main

import (
	"encoding/json"
	"net/http"

	"github.com/gorilla/mux"
)

func createUser(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json")
	var user User
	json.NewDecoder(r.Body).Decode(&user)
	Database.Create(&user)
	json.NewEncoder(w).Encode(user)
}
func getUsers(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json")
	var users []User
	Database.Find(&users)
	json.NewEncoder(w).Encode(users)
}
func getUserById(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json")
	var user User
	Database.First(&user, mux.Vars(r)["userId"])
	json.NewEncoder(w).Encode(user)
}
func updateUser(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json")
	var user User
	Database.First(&user, mux.Vars(r)["userId"])
	json.NewDecoder(r.Body).Decode(&user)
	Database.Save(&user)
	json.NewEncoder(w).Encode(user)
}
func deleteUser(w http.ResponseWriter, r *http.Request) {

	w.Header().Set("Content-Type", "application/json")
	var user User
	Database.Delete(&user, mux.Vars(r)["userId"])
	json.NewEncoder(w).Encode("User deleted successfully..")
}
