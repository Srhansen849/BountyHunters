export class User {
    //username:string;
    //password:password;
    constructor(public username: string, public password: string, public userid?: number, public firstname?: string, public lastname?: string,
        public email?: string, public rank?: number) {
        //this.username=username;
        //this.password=password;

    }
}

/*
@Id
    @Column(name="user_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userid;
	
    @Column(name="first_name", nullable=false)
    private String firstname;
	
    @Column(name="last_name", nullable=false)
    private String lastname;
	
    @Column(name="username", unique=true, nullable=false)
    private String username;
	
    @Column(name="password")
    private String password;
	
    @Column(name="email", unique=true, nullable=false)
    private String email;
	
    @Column(name="code_name", unique=true)
    private String codename;
	

    @Column(name="rank", unique=true)
    private int rank;
*/