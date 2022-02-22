import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/objects/user-object';

@Component({
  selector: 'app-top-bh-list',
  templateUrl: './top-bh-list.component.html',
  styleUrls: ['./top-bh-list.component.css']
})
export class TopBHListComponent implements OnInit {

  hunterList: User[] = [];

  constructor() { }

  ngOnInit(): void {
  }

}
