import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about-us',
  templateUrl: './about-us.component.html',
  styleUrls: ['./about-us.component.css']
})
export class AboutUsComponent implements OnInit {

  constructor() { 
    console.log("about-us constructor")
  }

  ngOnInit(): void {
    console.log("init contact-us")
  }

}
