import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent implements OnInit {

  user: User = new User();

  constructor(private userService:UserService,private router: Router) { 
    console.log("user-register constructor")
  }

  ngOnInit(): void {
    console.log("init  user-register")
  }

  saveUser(){
    this.userService.registerUser(this.user).subscribe(data =>{
      console.log(data);
      
    },
    error =>console.log(error));
    
  }

 
  onSubmit(){
    console.log(this.user);
    this.saveUser();
    alert("Succefully Registered")
    
    this.router.navigate(['home']);
    
  }
}
