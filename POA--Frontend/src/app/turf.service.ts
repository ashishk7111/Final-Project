import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Turf } from './turf';

@Injectable({
  providedIn: 'root'
})
export class TurfService {
  private baseURL = "http://localhost:8081/api";

  constructor(private httpClient:HttpClient) { }

  getTurfsList(): Observable<Turf[]>{
    return this.httpClient.get<Turf[]>(`${this.baseURL}`+"/turflist");
  }

  getTurf(turfAdd: any, turfType: any): Observable<Object>{
    
    let bURL = `http://localhost:8081/api/turflist1?turfAdd=${turfAdd}&turfType=${turfType}`
    console.log(bURL);
    return this.httpClient.get<any>(bURL);
}

registerTurf(turf: Turf): Observable<Object>{
  return this.httpClient.post(`${this.baseURL}`+"/addturf",turf);
}
  
}
