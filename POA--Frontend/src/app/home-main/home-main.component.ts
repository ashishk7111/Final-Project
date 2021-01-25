import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Turf } from '../turf';
import { TurfService } from '../turf.service';
import { UserService } from '../user.service';

@Component({
  selector: 'app-home-main',
  templateUrl: './home-main.component.html',
  styleUrls: ['./home-main.component.css']
})
export class HomeMainComponent implements OnInit {
  turflist: any;
  turfAdd: any;
  turfType: any;

  turfs !: Turf[];

  constructor(private service:UserService,private router:Router,private turfService:TurfService) { 
    console.log("home-main constructor")
  }

  ngOnInit(): void {
    this.getTurfs();
    console.log("init  home-main")
  }

  onSubmit(){
    this.service.logOut();
    this.router.navigate(['home']);
    alert("Successfully LoggedOut");
}

getTurfs(){
  this.turfService.getTurfsList().subscribe(data=>{this.turfs=data;});

}

getdata() {
  this.turfService.getTurf(this.turfAdd, this.turfType).subscribe(data => {
    console.log(data)
    this.turflist = data;
  });

 
}

onSubmitBooking(){
  this.router.navigate(['booking']);
}
}