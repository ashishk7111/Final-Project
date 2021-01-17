import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-manager-login',
  templateUrl: './manager-login.component.html',
  styleUrls: ['./manager-login.component.css']
})
export class ManagerLoginComponent implements OnInit {

  constructor() { 
    console.log("manager-login constructor")
  }

  ngOnInit(): void {
    console.log("init manager-login")
  
  }

}
