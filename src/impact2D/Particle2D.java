/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impact2D;

/**
 *
 * @author LeonWin
 */
public class Particle2D {
    public double x,y,vx,vy,r;
    public Particle2D(double x, double y, double vx, double vy, double r){
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.r = r;
    }
    public Particle2D(double[] vals){
        this.x = vals[0];
        this.y = vals[1];
        this.vx = vals[2];
        this.vy = vals[3];
        this.r = vals[4];
    }
    public void setTo(double[] vals){
        this.x = vals[0];
        this.y = vals[1];
        this.vx = vals[2];
        this.vy = vals[3];
        this.r = vals[4];
    }
    public void next(){
        x+=vx;
        y+=vy;
    }
    /*public void collideWith(Particle2D p, double dx, double dy, double Dx, double dvx, double dvy, double s){
        double Dv = Math.sqrt(dvx*dvx+dvy*dvy);
        double absv = Math.sqrt(vx*vx+vy*vy);
        double a = s/Dv;
        double b = Math.sqrt(Dx*Dx-a*a);
        
        vx = absv/a*dx + p.vx;
        vy = -absv/a*dy + p.vy;
        p.vx = absv/b*dy + p.vx;
        p.vy = absv/b*dx + p.vy;
        //double theta = Math.acos((dx*(vx-p.vx)+dy*(vy-p.vy))/Math.sqrt(dx*dx+dy*dy)/Math.sqrt((vx-p.vx)*(vx-p.vx)+(vy-p.vy)*(vy-p.vy)));
        
    }*/
    public void collideWith(Particle2D p, double dx, double dy, double Dx, double s){
        vx = vx - dx*s/Dx/Dx;
        vy = vy - dy*s/Dx/Dx;
        p.vx = p.vx + dx*s/Dx/Dx;
        p.vy = p.vy + dy*s/Dx/Dx;
    }
}
