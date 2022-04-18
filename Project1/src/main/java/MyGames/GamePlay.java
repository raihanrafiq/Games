/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyGames;

/**
 *
 * @author RaihanRafiq
 */
public class GamePlay {
    static String[] pilKom = {"g","b","k"};
    private String you, com, hasil;
    private int skorYou, skorCom;
    
    public GamePlay(int skoryou, int skorcom){
        this.skorCom = skorcom;
        this.skorYou = skoryou;
    }

    public String getCom() {
        return com = pilKom[0];
    }

    public String getHasil() {
        return hasil;
    }

    public int getSkorYou() {
        return skorYou;
    }

    public int getSkorCom() {
        return skorCom;
    }

    public void setYou(String you) {
        this.you = you;
    }
    
    void seleksiHasil(){
        //jika memilih gunting
        if ((this.you.equals("g")) && (this.com.equals("g"))){
            this.hasil = "DRAW!!";
        }else if ((this.you.equals("g")) && (this.com.equals("b"))){
            this.hasil = "YOU LOSE";
            skorCom++;
        }else if ((this.you.equals("g")) && (this.com.equals("k"))){
            this.hasil = "YOUWIN";
            skorYou++;
        }
        
        //jika kamu memilih batu
        if ((this.you.equals("b")) && (this.com.equals("b"))){
            this.hasil = "DRAW!!";
        }else if ((this.you.equals("b")) && (this.com.equals("k"))){
            this.hasil = "YOU LOSE";
            skorCom++;
        }else if ((this.you.equals("b")) && (this.com.equals("g"))){
            this.hasil = "YOUWIN";
            skorYou++;
        }
        
        //jika kamu memilih kertas
        if ((this.you.equals("k")) && (this.com.equals("k"))){
            this.hasil = "DRAW!!";
        }else if ((this.you.equals("k")) && (this.com.equals("g"))){
            this.hasil = "YOU LOSE";
            skorCom++;
        }else if ((this.you.equals("k")) && (this.com.equals("b"))){
            this.hasil = "YOUWIN";
            skorYou++;
        }
    }
    void pindahPos(){
        pilKom[0] = pilKom[1];
        pilKom[1] = pilKom[2];
        pilKom[2] = this.you;
    }
    void toHasil(){
        if (this.skorYou > this.skorCom){
            this.hasil = "YOU WINNER!!!";
        }else if (this.skorYou < this.skorCom){
            this.hasil = "YOU LOSE!!!";
        }else {
            this.hasil = "YOU DRAW";
        }
    }

    void totHasil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
