import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';


@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  username = 'admin'
  password = ''
  invalidLogin = false

  constructor(private router: Router,
    private loginservice: AdminService) { }

  ngOnInit(): void {
  }

  
  checkLogin() {
    if (this.loginservice.authenticate(this.username, this.password)
    ) {
      this.router.navigate(['admin-home'])
      this.invalidLogin = false
    } else
      this.invalidLogin = true
  }
}
