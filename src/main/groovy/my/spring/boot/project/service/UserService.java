package my.spring.boot.project.service;

import my.spring.boot.project.bean.UserConfig;

public class UserService {
      UserConfig userConfig;
     public UserService(UserConfig userConfig){
         this.userConfig=userConfig;
     }

}
