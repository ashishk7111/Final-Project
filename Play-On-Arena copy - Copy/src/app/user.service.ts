import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseURL = "http://localhost:8081/api";
  constructor(private httpClient: HttpClient) { }

  

  registerUser(user: User): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`+"/user",user);
}
}
