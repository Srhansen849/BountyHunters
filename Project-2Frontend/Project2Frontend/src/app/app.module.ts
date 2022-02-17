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
import { ConfirmedBountiesComponent } from './bounty/confirmed-bounties.component';

@NgModule({
  declarations: [
    AppComponent,
    UserLoginComponent,
    HomepageComponent,
    NewAccountComponent,
    ProfileComponent,
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

