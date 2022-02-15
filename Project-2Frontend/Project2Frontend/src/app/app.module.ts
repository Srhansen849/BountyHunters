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
<<<<<<< HEAD
import { RegisterBountyComponent } from './bounty/register-bounty/register-bounty.component';
import { ForgotPasswordComponent } from './user-login/forgot-password/forgot-password.component';
import { HomepageBusiComponent } from './homepage/homepage-busi/homepage-busi.component';
import { ProfileBusiComponent } from './profile/profile-busi/profile-busi.component';
import { ConfirmedBountiesComponent } from './bounty/bounty.component';
import { HomepageBountyComponent } from './homepage/homepage-bounty/homepage-bounty.component';
import { UploadBountyComponent } from './bounty/upload-bounty/upload-bounty.component';


=======
import { ConfirmedBountiesComponent } from './bounty/confirmed-bounties.component';
>>>>>>> 6f4b04aaea73daf95602b443e4ebbfc5d73858c8


@NgModule({
  declarations: [
    AppComponent,
    UserLoginComponent,
    HomepageComponent,
    NewAccountComponent,
    ProfileComponent,
<<<<<<< HEAD
    RegisterBountyComponent,
    ForgotPasswordComponent,
    HomepageBusiComponent,
    ProfileBusiComponent,
    ConfirmedBountiesComponent,
    HomepageBountyComponent,
    UploadBountyComponent
=======
    ConfirmedBountiesComponent
>>>>>>> 6f4b04aaea73daf95602b443e4ebbfc5d73858c8
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

