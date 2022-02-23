import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/objects/user-object';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-top-bh-list',
  templateUrl: './top-bh-list.component.html',
  styleUrls: ['./top-bh-list.component.css']
})
export class TopBHListComponent implements OnInit {

  bhunterList: User[] = []

  isVisable = true;

  toggleTable() {
    console.log("button click");
    this.isVisable = !this.isVisable;
  }

  constructor(private uServ: UserService, private router: Router) { }

  ngOnInit(): void {
    this.uServ.findAllBountyHunters().subscribe(
      response =>{
        this.bhunterList = response;
      }
      

    )


  }

}
