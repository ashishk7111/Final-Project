import { Component, OnInit } from '@angular/core';
import { Manager } from '../manager';
import { ManagerService } from '../manager.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-manager-login',
  templateUrl: './manager-login.component.html',
  styleUrls: ['./manager-login.component.css']
})
export class ManagerLoginComponent implements OnInit {

  manager : Manager = new Manager();
  public InvalidData= false;
  msg='';

  constructor(private service: ManagerService,private router:Router,private http:HttpClient) { }

  ngOnInit(): void {
  }
  loginManager(){

    this.service.loginManagerFromRemote(this.manager).subscribe(
      data=>{ console.log(data);
      
          sessionStorage.setItem('USER',this.manager.emailId);
          this.router.navigate(['add-turf']);
    
      },
      error=>this.msg="Invalid Credentials");
     
  }

  onSubmit(){
    console.log(this.manager);
    this.loginManager();
  }
}
