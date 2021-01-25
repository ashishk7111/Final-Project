import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Booking } from '../app/booking';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  private baseURL = "http://localhost:8081/api";

  constructor(private httpClient: HttpClient) { }


  public saveBooking(booking: Booking): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}` + "/booking", booking);
  }

}
