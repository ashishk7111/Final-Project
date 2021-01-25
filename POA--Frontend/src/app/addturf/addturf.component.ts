import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Turf } from '../turf';
import { TurfService } from '../turf.service';
import { UserService } from '../user.service';


@Component({
  selector: 'app-addturf',
  templateUrl: './addturf.component.html',
  styleUrls: ['./addturf.component.css']
})
export class AddturfComponent implements OnInit {

  turf : Turf=new Turf();

  constructor(private router:Router,private turfService:TurfService,private service:UserService) { }

  ngOnInit(): void {
  }

  saveTurf(){
    this.turfService.registerTurf(this.turf).subscribe(data =>{
      console.log(data);
      
      
    },
    error =>console.log(error));
    
  }


  onSubmit1(){
    console.log(this.turf);
    this.saveTurf();
    alert("Turf added successfully")
    this.router.navigate(['add-turf']);
    
  }

  onSubmit(){
    this.service.logOut();
    this.router.navigate(['home']);
    alert("Successfully LoggedOut");
}
}
