import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { HostService } from 'src/app/services/host.service';

@Component({
  selector: 'app-new-host',
  templateUrl: './new-host.component.html',
  styleUrls: ['./new-host.component.css']
})
export class NewHostComponent implements OnInit {

  hostForm = new FormGroup({
    husername: new FormControl(''),
    hpassword: new FormControl(''),
    hostname: new FormControl(''),
    hemail: new FormControl(''),
    representative: new FormControl(''),
    association: new FormControl('')
  });

  ngOnInit(): void {
  }

  constructor(private router:Router, private hServ: HostService, private actRoute:ActivatedRoute) { }

  public newHost(newhost: FormGroup) {
    let host = JSON.stringify(newhost);
    console.log(host);
    
    this.hServ.createNewHost(host).subscribe(
      response => {
        console.log(response);
        this.router.navigate(['./login']);

      },
      error => {
        console.warn("wrong credentials");
      }
    )

  }
}