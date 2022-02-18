import { User } from "../user-login/user";
import { Criminal } from "./objects/criminal-object";


export class Bounty{
    constructor(public capture:string, public amount:number, public currency:string, public time:string, public activeid:number, public bHolder:User, public criminal:Criminal, public hostid:number, public preferid:number, public turninid:number, public bountyid?:number){}

}