import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from "@angular/common/http";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { HomeComponent } from './home/home.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { UserRegisterComponent } from './user-register/user-register.component';
import { HomeMainComponent } from './home-main/home-main.component';

import { AdminLoginComponent } from './admin-login/admin-login.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ServicesComponent } from './services/services.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { ManagerLoginComponent } from './manager-login/manager-login.component';
import { ManagerRegisterComponent } from './manager-register/manager-register.component';
import { PaymentComponent } from './payment/payment.component';


import { MembershipComponent } from './membership/membership.component';
import { ManagerHomeComponent } from './manager-home/manager-home.component';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { ManagerlistComponent } from './managerlist/managerlist.component';
import { UserlistComponent } from './userlist/userlist.component';
import { AddturfComponent } from './addturf/addturf.component';
import { BookingComponent } from './booking/booking.component';
import { ForumComponent } from './forum/forum.component';




@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    UserLoginComponent,
    UserRegisterComponent,
    HomeMainComponent,
    AdminLoginComponent,
    ContactUsComponent,
    AboutUsComponent,
    ServicesComponent,
    ForgotPasswordComponent,
    ManagerLoginComponent,
    ManagerRegisterComponent,
    PaymentComponent,
   
    MembershipComponent,
    ManagerHomeComponent,
    AdminHomeComponent,
    ManagerlistComponent,
    UserlistComponent,
    AddturfComponent,
    BookingComponent,
    ForumComponent,
 
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MDBBootstrapModule.forRoot()
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
