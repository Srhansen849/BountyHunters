import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserLoginComponent } from './user-login/user-login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { NewAccountComponent } from './new-account/new-account.component';

import { ProfileComponent } from './profile/profile.component';
import { ConfirmedBountiesComponent } from './bounty/confirmed-bounties.component';


const routes: Routes = [
  { path: 'login', component: UserLoginComponent},
  { path: 'homepage', component: HomepageComponent},
  { path: 'newaccount', component: NewAccountComponent},
  { path: 'bounty', component: ConfirmedBountiesComponent},
  { path: 'profile', component: ProfileComponent},
  { path: 'confirmedbounty', component: ConfirmedBountiesComponent},
  { path: '**', redirectTo: 'homepage'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }