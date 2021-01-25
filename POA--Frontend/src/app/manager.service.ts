import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Manager } from './manager';

@Injectable({
  providedIn: 'root'
})
export class ManagerService {

  private baseURL = "http://localhost:8081/api";

  constructor(private httpClient: HttpClient) { }

  registerManager(manager: Manager): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`+"/managerregister",manager);
}

 loginManagerFromRemote(manager: Manager):Observable<Object>{
  return this.httpClient.post(`${this.baseURL}`+"/managerlogin",manager);
  
}
logOut() {
  sessionStorage.removeItem('USER');
}

isUserLoggedIn(){
  let manager= sessionStorage.getItem('USER');
  console.log(!(manager===null));
  return !(manager === null);
}

getManagersList(): Observable<Manager[]>{
  return this.httpClient.get<Manager[]>(`${this.baseURL}`+"/managerlist");
}


}
