import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserLoginComponent } from './user-login/user-login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { HomepageUserComponent } from './homepage/homepage-user/homepage-user.component';
import { HomepageHostComponent } from './homepage/homepage-host/homepage-host.component';
import { NewAccountComponent } from './new-account/new-account.component';
import { ComfirmBountyComponent } from './bounty/confirm/confirm-bounty.component'
import { UploadBountyComponent } from './bounty/upload/upload-bounty.component'
import { RegisterBountyComponent } from './bounty/register/register-bounty.component'
import { ForgotPasswordComponent } from './user-login/forgot-password/forgot-password.component';
import { ProfileComponent } from './profile/profile.component';
import { ProfileHostComponent } from './profile/profile-host/profile-host.component';
import { BountyComponent } from './bounty/bounty.component';


const routes: Routes = [
  { path: 'login', component: UserLoginComponent },
  { path: 'homepage', component: HomepageComponent },
  { path: 'homepage-user', component: HomepageUserComponent },
  { path: 'homepage-host', component: HomepageHostComponent },
  { path: 'newaccount', component: NewAccountComponent },
  { path: 'bounty', component: BountyComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'confirmbounty', component: ComfirmBountyComponent },
  { path: 'uploadbounty', component: UploadBountyComponent },
  { path: 'registerbounty', component: RegisterBountyComponent },
  { path: 'forgotpassword', component: ForgotPasswordComponent },
  { path: 'profile-host', component: ProfileHostComponent },
  { path: '**', redirectTo: 'homepage' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }