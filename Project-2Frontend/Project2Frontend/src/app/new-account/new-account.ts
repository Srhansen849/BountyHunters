<<<<<<< HEAD
export class NewHost {
    constructor (public firstname:string, public lastname:string,
                public codename:string, public currency:string,
                public username:string, public password:string,
                public email:string) {}
}

export class NewUser {
    constructor (public firstname:string, public lastname:string,
                public codename:string, public currency:string,
                public username:string, public password:string,
                public email:string,
                public representative:string, public association:string) {}
=======
export class NewUser {
    constructor(public firstname: string, public lastname: string, public codename: string,
        public currency: string, public username: string, public password: string,
        public email: string, public representative: string, public associateion: string) {
    }
}

export class NewHost {
    constructor(public firstname: string, public lastname: string,
        public codename: string, public currency: string,
        public username: string, public password: string,
        public email: string) { }
>>>>>>> 189ffc3d9e3f684b897029224e9c350324d25f96
}