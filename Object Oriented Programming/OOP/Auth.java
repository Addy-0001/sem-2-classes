public class Auth {
    
}

class User{
    String username; 
    String password;
}

class Admin extends User{

}

class HR extends Admin{

}

class Accounts extends Admin{

}

class Normal extends User{

}

class Teacher extends Normal{

}

class FullTime extends Teacher{

}

class PartTime extends Teacher{
    
}

class Student extends Normal{

}

