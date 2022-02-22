import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';
import { TopBHListComponent } from './homepage/top-bh-list/top-bh-list.component';
import { LoginComponent } from './login/login.component';
import { NewAccountComponent } from './new-account/new-account.component';
import { NewBountyHunterComponent } from './new-account/new-bounty-hunter/new-bounty-hunter.component';
import { NewHostComponent } from './new-account/new-host/new-host.component';
import { BountyHunterComponent } from './bounty-hunter/bounty-hunter.component';
import { HostComponent } from './host/host.component';
import { ActiveBountyListComponent } from './bounty-hunter/active-bounty-list/active-bounty-list.component';
import { EditProfileComponent } from './bounty-hunter/edit-profile/edit-profile.component';
import { TurninBountyComponent } from './bounty-hunter/turnin-bounty/turnin-bounty.component';
import { FinishedBountyListComponent } from './bounty-hunter/finished-bounty-list/finished-bounty-list.component';
import { PendingBountyListComponent } from './host/pending-bounty-list/pending-bounty-list.component';
import { FinishBountyComponent } from './host/finish-bounty/finish-bounty.component';
import { HostBountyListComponent } from './host/host-bounty-list/host-bounty-list.component';
import { EditHostProfileComponent } from './host/edit-host-profile/edit-host-profile.component';
import { UserLoginComponent } from './login/user-login/user-login.component';
import { HostLoginComponent } from './login/host-login/host-login.component';
import { FormBuilder, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NewBountyComponent } from './host/new-bounty/new-bounty.component';


@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    TopBHListComponent,
    LoginComponent,
    NewAccountComponent,
    NewBountyHunterComponent,
    NewHostComponent,
    BountyHunterComponent,
    HostComponent,
    ActiveBountyListComponent,
    EditProfileComponent,
    TurninBountyComponent,
    FinishedBountyListComponent,
    PendingBountyListComponent,
    FinishBountyComponent,
    HostBountyListComponent,
    EditHostProfileComponent,
    UserLoginComponent,
    HostLoginComponent,
    NewBountyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormBuilder

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
