package HerancaPolimorfismo;

public non-sealed class Manager extends Employee {
    
    private String login;
    private String password;
    private double comission;


    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public double getComission(){
        return comission;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setComission(double comission){
        this.comission = comission;
    }
    
}
