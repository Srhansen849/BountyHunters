import { Bounty } from "./bounty-object";

export class Host{
    constructor(public hostid?:number,
                public hostname?:string,                
                public husername?:string, public hpassword?:string, 
                public hemail?:string,  
                public representative?:string, public hassociation?:string, public hbountylist?:Bounty[]){}
}
