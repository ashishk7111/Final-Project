import { Component, OnInit } from '@angular/core';
import { Manager } from '../manager';
import { ManagerService } from '../manager.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-manager-register',
  templateUrl: './manager-register.component.html',
  styleUrls: ['./manager-register.component.css']
})
export class ManagerRegisterComponent implements OnInit {

  manager: Manager = new Manager();

  constructor(private managerService:ManagerService,private router: Router) { }

  ngOnInit(): void {
  }

  saveManager(){
    this.managerService.registerManager(this.manager).subscribe(data =>{
      console.log(data);
      alert("Registered Successfully")
      
    },
    error =>console.log(error));
    
  }


  onSubmit(){
    console.log(this.manager);
    this.saveManager();
    this.router.navigate(['home']);
    
  }

}
