/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routeopt;

/**
 *
 * @author Hayat
 */
class Driver {
    private int mobile;
    private String name;
    
    public Driver(String name, int mobile){
        this.name = name;        
        this.mobile = mobile;        
    }
    
    public String getName(){
        return name;
    }

    public int getMobile(){
        return mobile;
    }

}
