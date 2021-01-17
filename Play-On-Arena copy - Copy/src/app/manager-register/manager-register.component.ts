import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-manager-register',
  templateUrl: './manager-register.component.html',
  styleUrls: ['./manager-register.component.css']
})
export class ManagerRegisterComponent implements OnInit {

  constructor() { 
    console.log("manager-register constructor")
  }

  ngOnInit(): void {
    console.log("init manager-register")
  
  }

}
