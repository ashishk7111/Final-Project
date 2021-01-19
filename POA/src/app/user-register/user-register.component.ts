import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent implements OnInit {

  constructor() { 
    console.log("user-register constructor")
  }

  ngOnInit(): void {
    console.log("init  user-register")
  }
}
