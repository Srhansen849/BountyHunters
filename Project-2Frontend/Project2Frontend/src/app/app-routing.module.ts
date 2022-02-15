import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserLoginComponent } from './user-login/user-login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { NewAccountComponent } from './new-account/new-account.component';
import { RegisterBountyComponent } from './bounty/register-bounty/register-bounty.component';
import { ProfileComponent } from './profile/profile.component';
import { ForgotPasswordComponent } from './user-login/forgot-password/forgot-password.component';
import { HomepageBusiComponent } from './homepage/homepage-busi/homepage-busi.component';
import { ProfileBusiComponent } from './profile/profile-busi/profile-busi.component';
import { ConfirmedBountiesComponent } from './bounty/bounty.component';
import { HomepageBountyComponent } from './homepage/homepage-bounty/homepage-bounty.component';
import { UploadBountyComponent } from './bounty/upload-bounty/upload-bounty.component';

const routes: Routes = [
  { path: 'login', component: UserLoginComponent},
  { path: 'homepage', component: HomepageComponent},
  { path: 'newaccount', component: NewAccountComponent},
  { path: 'registerbounty', component: RegisterBountyComponent},
  { path: 'profile', component: ProfileComponent},
  { path: 'forgotpassword', component: ForgotPasswordComponent},
  { path: 'businesshomepage', component: HomepageBusiComponent},
  { path: 'businessprofile', component: ProfileBusiComponent},
  { path: 'confirmedbounty', component: ConfirmedBountiesComponent},
  { path: 'bountyhomepage', component: HomepageBountyComponent},
  { path: 'uploadbounty', component: UploadBountyComponent},
  { path: '**', redirectTo: 'homepage'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }