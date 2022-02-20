import { Criminal } from "./criminal-object";
import { Host } from "./host-object";
import { User } from "./user-object";




export class Bounty{
    constructor(public capture:string, public amount:number, 
                public currency:string, public time:string, 
                public activeid:string, public userid?:User, 
                public criminalid?:Criminal, public hostid?:Host, 
                public preferid?:string, public turninid?:string, 
                public bountyid?:number){}

}
