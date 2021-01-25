import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { Manager } from './../manager';
import { Router } from '@angular/router';
import { ManagerService } from '../manager.service';


@Component({
  selector: 'app-managerlist',
  templateUrl: './managerlist.component.html',
  styleUrls: ['./managerlist.component.css']
})
export class ManagerlistComponent implements OnInit {

  managers!: Manager[];

  constructor(private service : ManagerService, private router:Router) { }

  ngOnInit(): void {
    this.getManagers();
  }

  
  
  onSubmit(){
    this.service.logOut();
    this.router.navigate(['home']);
    alert("Successfully LoggedOut");
}
private getManagers(){
  this.service.getManagersList().subscribe(data => {
    this.managers = data;
  });
}

onSubmit1(){
    this.router.navigate(['manager-list']);
  }

  onSubmit2(){
    this.router.navigate(['user-list']);
  }

}
