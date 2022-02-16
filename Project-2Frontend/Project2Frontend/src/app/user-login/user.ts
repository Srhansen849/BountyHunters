export class User{
       
    constructor(public username:string, public password:string, 
                public userid?: number, public firstname?: string, 
                public lastname?: string, public email?: string, 
                public rank?: number, public codename?: string
                ){
    }
}