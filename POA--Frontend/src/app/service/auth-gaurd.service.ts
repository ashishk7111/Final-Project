import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { UserService } from '../user.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGaurdService {

  constructor(private router:Router, private service: UserService) { }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
   
    if(this.service.isUserLoggedIn())
      return true;
    
    this.router.navigate(['home']);
    return false;
  }



  
}
