import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from "./login/login.component";
import { RegisterComponent } from "./register/register.component";
import { HomeComponent } from './home/home.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { HomeMainComponent } from './home-main/home-main.component';
import { ManagerLoginComponent } from './manager-login/manager-login.component';
import { ManagerRegisterComponent } from './manager-register/manager-register.component';
import { ManagerHomeComponent } from './manager-home/manager-home.component';


const routes: Routes = [
  { path: 'login', component: LoginComponent},
  { path: 'register', component: RegisterComponent},
  {path:'about-us', component: AboutUsComponent},
  {path:'contact-us',component : ContactUsComponent},
  {path:'home-main',component: HomeMainComponent },
  {path:'manager-login',component: ManagerLoginComponent },
  {path:'manager-register',component: ManagerRegisterComponent },
  {path:'manager-home',component: ManagerHomeComponent },
  
  
  {
    path: 'home', component: HomeComponent,
    children: [
      {path :'SignUp', component :RegisterComponent},
      {path :'SignIn', component:LoginComponent},
   
    ]
  },
 
  {path:'', redirectTo:'home', pathMatch: 'full'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
  
  
})
export class AppRoutingModule { }
