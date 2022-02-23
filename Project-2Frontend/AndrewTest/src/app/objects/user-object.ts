import { Account } from "./account-object";
import { Bounty } from "./bounty-object";

export class User{
    constructor(public userid?:number,
                public huntername?:string,
                public uusername?:string, public upassword?:string, 
                public uemail?:string, 
                public uaccount?:Account,
                public ubountylist?:Bounty[]){}
}
