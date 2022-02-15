import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserLoginComponent } from './user-login/user-login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { NewAccountComponent } from './new-account/new-account.component';
<<<<<<< HEAD
import { RegisterBountyComponent } from './bounty/register-bounty/register-bounty.component';
import { ProfileComponent } from './profile/profile.component';
import { ForgotPasswordComponent } from './user-login/forgot-password/forgot-password.component';
import { HomepageBusiComponent } from './homepage/homepage-busi/homepage-busi.component';
import { ProfileBusiComponent } from './profile/profile-busi/profile-busi.component';
import { ConfirmedBountiesComponent } from './bounty/bounty.component';
import { HomepageBountyComponent } from './homepage/homepage-bounty/homepage-bounty.component';
import { UploadBountyComponent } from './bounty/upload-bounty/upload-bounty.component';
=======

import { ProfileComponent } from './profile/profile.component';

import { ConfirmedBountiesComponent } from './bounty/confirmed-bounties.component';

import { UploadBountyComponent } from './upload-bounty/upload-bounty.component';
>>>>>>> 6f4b04aaea73daf95602b443e4ebbfc5d73858c8

const routes: Routes = [
  { path: 'login', component: UserLoginComponent},
  { path: 'homepage', component: HomepageComponent},
  { path: 'newaccount', component: NewAccountComponent},
  //{ path: 'registerbounty', component: },
  { path: 'profile', component: ProfileComponent},
  //{ path: 'forgotpassword', component: },
  //{ path: 'businesshomepage', component: },
  //{ path: 'businessprofile', component: },
  { path: 'confirmedbounty', component: ConfirmedBountiesComponent},
  //{ path: 'bountyhomepage', component: },
  { path: 'uploadbounty', component: UploadBountyComponent},
  { path: '**', redirectTo: 'homepage'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }