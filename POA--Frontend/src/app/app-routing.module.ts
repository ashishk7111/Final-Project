import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
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
import { AuthGaurdService } from './service/auth-gaurd.service';
import { ForumComponent } from './forum/forum.component';





const routes: Routes = [
  { path: 'home', component: HomeComponent},
  { path: 'user-login', component: UserLoginComponent},
  { path: 'user-register', component: UserRegisterComponent},
  { path: 'home-main', component: HomeMainComponent,canActivate:[AuthGaurdService]},
  { path: 'admin-login', component: AdminLoginComponent},
  { path: 'contact-us', component: ContactUsComponent },
  { path: 'about-us', component: AboutUsComponent },
  { path: 'services', component: ServicesComponent,canActivate:[AuthGaurdService]},
  { path: 'forgot-password', component: ForgotPasswordComponent},
  { path: 'manager-login', component: ManagerLoginComponent},
  { path: 'manager-register', component: ManagerRegisterComponent},
  { path: 'payment', component: PaymentComponent,canActivate:[AuthGaurdService]},
  { path: 'membership', component: MembershipComponent,canActivate:[AuthGaurdService]},
  { path: 'manager-home', component:ManagerHomeComponent,canActivate:[AuthGaurdService]},
  { path: 'admin-home', component:AdminHomeComponent,canActivate:[AuthGaurdService]},
  { path: 'manager-list', component:ManagerlistComponent,canActivate:[AuthGaurdService]},
  { path: 'user-list', component:UserlistComponent,canActivate:[AuthGaurdService]},
  { path: 'add-turf', component:AddturfComponent,canActivate:[AuthGaurdService]},
  { path: 'booking', component:BookingComponent,canActivate:[AuthGaurdService]},
  { path: 'forum', component:ForumComponent},
  {path:'', redirectTo:'home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
