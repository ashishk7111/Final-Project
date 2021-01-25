import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Booking } from '../booking';

import { BookingService } from '../booking.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  booking: Booking = new Booking();

  constructor(private bookingService: BookingService, private router: Router) { }

  ngOnInit(): void {
  }

  saveBooking() {
    return this.bookingService.saveBooking(this.booking).subscribe(data => {
      console.log(data);
      alert("YOur Booking Confirmed..!");
      this.router.navigate(['home-main']);


      // alert(JSON.stringify(data));


    },
      error => 
      alert("TimeSlot not  available")
      
      );
      

  }

  

  onSubmit(){
    // console.log(this.booking);
    this.saveBooking();
    // alert("YOur Booking Confirmed..!");
     this.router.navigate(['home-main']);
    // alert(JSON.stringify(this.booking));
  }
}
