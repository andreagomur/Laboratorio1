/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market;

/**
*
* @author Andre
*/
public class Emply{
private String Name;
private int Time;
private float Smin;
private int Htrab;
public Emply(String Name, int Time, float Minimo) {
    this.Name = Name;
    this.Time = Time;
    this.Smin = Minimo;
    this.Htrab = 0;

}

public int getHtrab(){

return Htrab;
}

public String getName() {
return Name;
}

public int getTime() {
return Time;
}

public float getSmin() {
return Smin;
}

public void Numhs(int hsdia){
this.Htrab += hsdia;
}
}