import { Criminal } from "./criminal-object";
import { Host } from "./host-object";
import { Status } from "./status-object";
import { User } from "./user-object";




export class Bounty{
    constructor(public capture:string, public amount:number, 
                public currency:string, public time:string, 
                public activeid:Status, public bHolder:User, 
                public criminalid:Criminal, public hostHolder:Host, 
                public preferid:Status, public turninid:Status, 
                public bountyid?:number){}

}
