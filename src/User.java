class User {
    private int mobile;
    private String name, address;
    private double latitude, longitude;
    private int weight;
    private String date;
        
    public User(String name,String address, double latitude, double longitude,int mobile, int weight){
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mobile = mobile;
        this.weight = weight;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public double getLatitude(){
        return latitude;
    }
    
    public double getLongitude(){
        return longitude;
    }
    
    public int getMobile(){
        return mobile;
    }
    
    public int getWeight(){
        return weight;
    }
    
    //public int getDate(){
    //    return date;
   // }
}
