import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
import { User} from './../user'

@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {

  users!: User[];
  constructor(private service : UserService, private router:Router) { }

  ngOnInit(): void {
    this.getUsers();
  }

  private getUsers(){
    this.service.getUsersList().subscribe(data => {
      this.users = data;
    });
  }

  onSubmit(){
    this.service.logOut();
    this.router.navigate(['home']);
    alert("Successfully LoggedOut");
}
  onSubmit1(){
    this.router.navigate(['manager-list']);
  }
  onSubmit2(){
    this.router.navigate(['user-list']);
  }

}
