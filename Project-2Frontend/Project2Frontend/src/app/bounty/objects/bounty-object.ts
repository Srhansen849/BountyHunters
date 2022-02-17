export class Bounty{
    constructor(public capture:string, public amount:number, 
                public currency:string, public time:string, 
                public activeid:number, public userid:number, 
                public criminalid:number, public hostid:number, 
                public preferid:number, public turninid:number, 
                public bountyid?:number){}

}
