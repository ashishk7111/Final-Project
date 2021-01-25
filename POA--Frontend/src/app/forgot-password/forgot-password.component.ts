import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-forgot-password',
  templateUrl: './forgot-password.component.html',
  styleUrls: ['./forgot-password.component.css']
})
export class ForgotPasswordComponent implements OnInit {

  user: User=new User();
  constructor(private service:UserService,private router:Router) { }

  ngOnInit(): void {
  }

  createToken(){
    this.service.forgot(this.user).subscribe(
      data=>{ console.log(data);
        
          this.router.navigate(['home-main']);
          alert()
    
      },
      error=>console.log("error"));
  }

  onSubmit(){
    this.createToken();
    alert(this.user.token)
  }
}
