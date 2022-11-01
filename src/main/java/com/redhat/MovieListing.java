package com.redhat;

public class MovieListing {

        private Integer id;
        private String name;
        private String imageURL;
    
        public MovieListing() {
        }
    
        public MovieListing(Integer id) {
            this.id = id;
        }
        public void setId(Integer i) {
            id = i;
        }
        public Integer getId() {
            return id;
        }
        public void setName(String n){
            name = n;
          }
        public String getName(){
            return name;
        }
        public void setImageURL(String u) {
            imageURL = u;
        }
        public String getImageURL() {
            return imageURL;
        }
    }   