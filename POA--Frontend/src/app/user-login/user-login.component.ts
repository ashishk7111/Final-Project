import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

  user : User = new User();
  public InvalidData= false;
  msg='';

  constructor(private service: UserService,private router:Router,private http:HttpClient) { 
    console.log("user-login constructor")
  }

  ngOnInit(): void {
    console.log("init  user-login")
  }

  loginUser(){

    this.service.loginUserFromRemote(this.user).subscribe(
      data=>{ console.log(data);
      
          sessionStorage.setItem('USER',this.user.emailId);
          this.router.navigate(['home-main']);
    
      },
      error=>this.msg="Invalid Credentials");
     
  }

  onSubmit(){
    console.log(this.user);
    this.loginUser();
  }

}
