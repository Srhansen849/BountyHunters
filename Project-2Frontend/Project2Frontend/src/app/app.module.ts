import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { ForgotPasswordComponent } from './user-login/forgot-password/forgot-password.component';
import { HomepageComponent } from './homepage/homepage.component';
import { HomepageUserComponent } from './homepage/homepage-user/homepage-user.component';
import { HomepageHostComponent } from './homepage/homepage-host/homepage-host.component';
import { NewAccountComponent } from './new-account/new-account.component';
import { ProfileComponent } from './profile/profile.component';
import { ProfileHostComponent } from './profile/profile-host/profile-host.component';
import { BountyComponent } from './bounty/bounty.component';
import { ComfirmBountyComponent } from './bounty/confirm/confirm-bounty.component'
import { UploadBountyComponent } from './bounty/upload/upload-bounty.component'
import { RegisterBountyComponent } from './bounty/register/register-bounty.component'


@NgModule({
  declarations: [
    AppComponent,
    UserLoginComponent,
    HomepageComponent,
    HomepageUserComponent,
    HomepageHostComponent,
    NewAccountComponent,
    ProfileComponent,
    ProfileHostComponent,
    BountyComponent,
    ComfirmBountyComponent,
    ForgotPasswordComponent,
    UploadBountyComponent,
    RegisterBountyComponent


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
