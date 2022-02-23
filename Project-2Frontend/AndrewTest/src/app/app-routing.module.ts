import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BountyHunterComponent } from './bounty-hunter/bounty-hunter.component';
import { HomepageComponent } from './homepage/homepage.component';
import { HostComponent } from './host/host.component';
import { LoginComponent } from './login/login.component';
import { NewAccountComponent } from './new-account/new-account.component';

const routes: Routes = [
  {path: 'homepage', component: HomepageComponent},
  {path: 'login', component: LoginComponent},
  {path: 'bountyhunter', component: BountyHunterComponent},
  {path: 'host', component: HostComponent},
  {path: 'newacc', component: NewAccountComponent},
  { path: '**', redirectTo: 'homepage'}
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
