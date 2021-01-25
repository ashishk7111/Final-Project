import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';
import { ManagerService } from '../manager.service';

@Component({
  selector: 'app-admin-home',
  templateUrl: './admin-home.component.html',
  styleUrls: ['./admin-home.component.css']
})
export class AdminHomeComponent implements OnInit {

  constructor(private service:AdminService,private router:Router,private managerService:ManagerService) { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.service.logOut();
    this.router.navigate(['home']);
    alert("Successfully LoggedOut");
}
  onSubmit1(){
    this.router.navigate(['manager-list']);
  }
  onSubmit2(){
    this.router.navigate(['user-list']);
  }

}
