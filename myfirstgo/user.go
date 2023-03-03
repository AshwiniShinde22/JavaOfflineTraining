package main

import "gorm.io/gorm"

type User struct {
	gorm.Model
	UserId   int    `json:"id"`
	UserName string `json:"name"`
	Email    string `json:"email"`
	DOB      string `json:"dob"`
	MobileNo int    `json:"mobilno"`
}
