import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { NewAccountComponent } from './new-account/new-account.component';
import { ActiveBountiesComponent } from './active-bounties/active-bounties.component';
import { ProfileComponent } from './profile/profile.component';
import { RegisterBountyComponent } from './register-bounty/register-bounty.component';
import { ActiveHuntersComponent } from './active-hunters/active-hunters.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { HomepageBusiComponent } from './homepage-busi/homepage-busi.component';
import { ProfileBusiComponent } from './profile-busi/profile-busi.component';
import { ConfirmedBountiesComponent } from './confirmed-bounties/confirmed-bounties.component';

@NgModule({
  declarations: [
    AppComponent,
    UserLoginComponent,
    HomepageComponent,
    NewAccountComponent,
    ActiveBountiesComponent,
    ProfileComponent,
    RegisterBountyComponent,
    ActiveHuntersComponent,
    ForgotPasswordComponent,
    HomepageBusiComponent,
    ProfileBusiComponent,
    ConfirmedBountiesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, //2 way databinding
    ReactiveFormsModule, //Controllers
    HttpClientModule // get http requests
  ],
  providers: [],
  bootstrap: [
    AppComponent]
})
export class AppModule { }

