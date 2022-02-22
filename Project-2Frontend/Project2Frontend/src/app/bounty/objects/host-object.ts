import { Bounty } from "./bounty-object";

export class Host{
    constructor(public username:string, public password:string, 
                public email?:string, public firstname?:string, 
                public lastname?:string, public codename?:string, 
                public representative?:string, public association?:string, 
                public hostid?:number){}
}
