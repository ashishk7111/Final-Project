import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-manager-home',
  templateUrl: './manager-home.component.html',
  styleUrls: ['./manager-home.component.css']
})
export class ManagerHomeComponent implements OnInit {

  constructor() { 
    console.log("manager-home constructor")
  }

  ngOnInit(): void {
    console.log("init manager-home")
  
  }
}
