package entities;

public class Bill {
private char gender;
private int beer;
private int barbecue;
private int softDrink;


  public double feeding() {


    double feedingTotal =
     (beer * 5.0) +
     (softDrink * 3.0) +
     (barbecue * 7); 


     return feedingTotal;

  }

 public double couver(){

    if (feeding() > 30){

         double couvert = 4.0;
         return couvert;

     } else{

        return 0.0;

     }
  }

  public double ticket(){
    if (gender == 'M'){
     
        return 8.0;

     } else {
        
        return 10.0;

      }  
    }   

  public double total(){

    return feeding() + couver() + ticket();

  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public int getBeer() {
    return beer;
  }

  public void setBeer(int beer) {
    this.beer = beer;
  }

  public int getBarbecue() {
    return barbecue;
  }

  public void setBarbecue(int barbecue) {
    this.barbecue = barbecue;
  }

  public int getSoftDrink() {
    return softDrink;
  }

  public void setSoftDrink(int softDrink) {
    this.softDrink = softDrink;
  }
    
  }


