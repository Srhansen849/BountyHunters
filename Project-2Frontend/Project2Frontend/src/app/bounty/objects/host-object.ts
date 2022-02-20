import { Bounty } from "./bounty-object";

export class Host {
    constructor(public association: string, public codename: string, public email: string, public firstname: string, public lastname: string, public password: string, public representative: string, public username: string, public bounty_list: Bounty[], public hostid?: number) { }
}
