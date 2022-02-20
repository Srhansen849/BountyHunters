import { Account } from "./account-object";

export class Asset{
    constructor(public balance?:number, public ascurrency?:string, public assetid?:number, public accountfk?: Account){}
}