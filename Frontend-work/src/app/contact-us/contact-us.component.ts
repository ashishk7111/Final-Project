import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contact-us',
  templateUrl: './contact-us.component.html',
  styleUrls: ['./contact-us.component.css']
})
export class ContactUsComponent implements OnInit {

  constructor() { 
    console.log("contact-us constructor")
  }

  ngOnInit(): void {
    console.log("init  contact-us")
  }

}
