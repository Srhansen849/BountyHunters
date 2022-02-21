import { Asset } from "./asset-object";

export class Account{
    constructor(public accountid?:number, public asset?: Asset[]){}
}
