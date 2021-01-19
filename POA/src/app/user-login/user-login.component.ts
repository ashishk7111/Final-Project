import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

  constructor() { 
    console.log("user-login constructor")
  }

  ngOnInit(): void {
    console.log("init  user-login")
  }

}
