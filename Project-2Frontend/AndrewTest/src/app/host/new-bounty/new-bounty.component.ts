import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormGroupDirective } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Criminal } from 'src/app/objects/criminal-object';
import { BountyService } from 'src/app/services/bounty.service';

@Component({
  selector: 'app-new-bounty',
  templateUrl: './new-bounty.component.html',
  styleUrls: ['./new-bounty.component.css']
})
export class NewBountyComponent implements OnInit {

  bountyForm = new FormGroup({
    statusid: new FormControl(''),
    amount: new FormControl(''),
    currency: new FormControl(''),
    time: new FormControl(''),
    preferid: new FormControl('')
  });

  criminalForm = new FormGroup({
    crimname: new FormControl(''),
    species: new FormControl(''),
    height: new FormControl(''),
    weight: new FormControl('')
  });


  // generateCriminal(criminal: FormGroup){
  // newcriminal = new Criminal(criminal.get("crimname"), criminal.get("species"), criminal.get("height"), criminal.get("weight"))

  // }

  // generateBounty(bounty:FormGroup, newcriminal){


  // }

  constructor(private bServ:BountyService, private router: Router, private actRoute:ActivatedRoute) { }


  submitBounty(bounty: FormGroup, criminal: FormGroup){
    let stringbounty = JSON.stringify(bounty.value);
    let stringcriminal = JSON.stringify(criminal.value)
    // criminal = new Criminal();
    // bounty = new Bounty();

    console.log(bounty.value);
    this.bServ.createNewBounty(stringbounty, stringcriminal);
    
  }

  // public submitFood(food: FormGroup){
  //   let stringFood = JSON.stringify(food.value);
  //   this.foodServ.insertFood(stringFood).subscribe(
  //     response => {
  //       this.foodExists=false;
  //       console.log(response);
  //       this.foodList.push(response);
  //     },
  //     error => {
  //       console.warn("that food already exists");
  //       this.foodExists=true;
  //     }
  //   );
  // }

  



  ngOnInit(): void {
  }

}
