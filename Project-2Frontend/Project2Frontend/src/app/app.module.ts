import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { HomepageComponent } from './homepage/homepage.component';
import { NewAccountComponent } from './new-account/new-account.component';
import { ProfileComponent } from './profile/profile.component';
import { RegisterBountyComponent } from './bounty/register-bounty/register-bounty.component';
import { ForgotPasswordComponent } from './user-login/forgot-password/forgot-password.component';
import { HomepageBusiComponent } from './homepage/homepage-busi/homepage-busi.component';
import { ProfileBusiComponent } from './profile/profile-busi/profile-busi.component';
import { ConfirmedBountiesComponent } from './bounty/bounty.component';
import { HomepageBountyComponent } from './homepage/homepage-bounty/homepage-bounty.component';
import { UploadBountyComponent } from './bounty/upload-bounty/upload-bounty.component';




@NgModule({
  declarations: [
    AppComponent,
    UserLoginComponent,
    HomepageComponent,
    NewAccountComponent,
    ProfileComponent,
    RegisterBountyComponent,
    ForgotPasswordComponent,
    HomepageBusiComponent,
    ProfileBusiComponent,
    ConfirmedBountiesComponent,
    HomepageBountyComponent,
    UploadBountyComponent
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

