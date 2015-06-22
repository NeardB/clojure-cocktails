(ns clojure-cocktails.db
  (:require [clojure.java.jdbc :as sql]
            [hiccup.page :as hic-p]
            )

(def db {:classname "com.mysql.jdbc.Driver"
         :subprotocol "mysql"
         :subname "//localhost:3306/cocktails"
         :user "root"
         :password ""})            
            
