package main

import (
	"fmt"

	"gorm.io/driver/mysql"
	"gorm.io/gorm"
)

var Database *gorm.DB
var urlDNS = "root:root@tcp(localhost:3306)/mydb?parseTime=true"
var err error

func DataMigration() {

	Database, err = gorm.Open(mysql.Open(urlDNS), &gorm.Config{})
	if err != nil {
		fmt.Println(err.Error())
		panic("connection faild:")
	}
	Database.AutoMigrate(&User{})

}
