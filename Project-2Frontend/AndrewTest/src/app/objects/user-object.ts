import { Account } from "./account-object";
import { Bounty } from "./bounty-object";

export class User {
    constructor(public uusername: string, public upassword: string,
        public huntername?: string, public uemail?: string,
        public uaccount?: Account, public ubountylist?: Bounty[]) { }

}
