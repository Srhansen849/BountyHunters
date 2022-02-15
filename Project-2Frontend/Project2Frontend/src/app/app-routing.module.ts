import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserLoginComponent } from './user-login/user-login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { NewAccountComponent } from './new-account/new-account.component';
import { RegisterBountyComponent } from './register-bounty/register-bounty.component';
import { ProfileComponent } from './profile/profile.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { HomepageBusiComponent } from './homepage-busi/homepage-busi.component';
import { ProfileBusiComponent } from './profile-busi/profile-busi.component';
import { ConfirmedBountiesComponent } from './confirmed-bounties/confirmed-bounties.component';

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
  { path: '**', redirectTo: 'homepage'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }