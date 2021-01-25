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

 loginUserFromRemote(user :User):Observable<Object>{
  return this.httpClient.post(`${this.baseURL}`+"/login",user);
  
}
logOut() {
  sessionStorage.removeItem('USER');
}

isUserLoggedIn(){
  let user= sessionStorage.getItem('USER');
  console.log(!(user===null));
  return !(user === null);
}
getUsersList(): Observable<User[]>{
  return this.httpClient.get<User[]>(`${this.baseURL}`+"/userlist");
}

forgot(user :User):Observable<Object>{

  return this.httpClient.post(`${this.baseURL}`+"/forgot-password",user);
  
  
}
}
