import { Account } from "./account-object";
import { Bounty } from "./bounty-object";

export class User{
    constructor(public username:string, public password:string, 
                public firstname?:string, public lastname?:string, 
                public email?:string, public rank?:number, 
                public codename?:string, public account?:Account, 
                public userid?:number){}
}
