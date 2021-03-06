package club.banyuan.June12_13.Product;

class Product{
    private String name;
    private double price;
    private static int scanCode=1000;
    private int num;

   public Product(String name,double price){
       this.name=name;
       this.price=price;
   }
   public String getName(){
       return name;
    }
    public int getScanCode(){
       return scanCode;
    }
    public double getPrice(){
       return price;
    }
    public void changePrice(double price){
       this.price=price;
    }
    public int getNum(){
       return num;
    }
    public void setNum(int num){
       this.num=num;
    }
    public String getInfo(){
       return "----产品信息----"+"\n名称:"+name+"\n编码："+scanCode+"\n价格："+price+"元";
    }
    public boolean buy(int num){
       if(this.num<num){
           return false;
       }else{
           return true;
       }
    }
}