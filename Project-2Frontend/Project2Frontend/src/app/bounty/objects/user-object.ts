import { Account } from "./account-object";
import { Bounty } from "./bounty-object";

export class User {
    constructor(public username: string, public password: string,
        public codename?: string, public email?: string,
        public firstname?: string, public lastname?: string,
        public rank?: number, public account?: Account,
        public bounty_list?: Bounty[], public userid?: number) { }
}
