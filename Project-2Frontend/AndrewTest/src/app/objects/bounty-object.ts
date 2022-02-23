
import { Criminal } from "./criminal-object";
import { Host } from "./host-object";
import { User } from "./user-object";

export class Bounty{
    constructor(public criminalfk?:Criminal, public amount?:number, 
                public currency?:string, public time?:string, 
                public activeid?:string, public userfk?:User, 
                public hostfk?:Host, 
                public preferid?:string, public turninid?:string, 
                public bountyid?:number){}

}
