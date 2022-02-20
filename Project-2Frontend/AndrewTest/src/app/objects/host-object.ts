import { Bounty } from "./bounty-object";

export class Host{
    constructor(public husername:string, public hpassword:string, 
                public hostname?:string, public hemail?:string,  
                public representative?:string, public association?:string, public hbountylist?:Bounty[]){}
}
