int x = 350;
int y = 350;
PImage backgroundImage;

boolean foward = true;
boolean up  = true;
import ddf.minim.*;  
Minim minim;
AudioSample sound;

void setup(){
  backgroundImage = loadImage("backgroundImage.png");
  size(700, 700);
minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
}
void draw() {
  image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
 
  fill(0, 255, 0);
stroke(0, 0,255);
ellipse(x, y, 20, 20);
if(up){
 y-=7; 
}
else{
  y+= 7;
}
 if( x>=height){
   up = false;
   sound.trigger();

 }
 else if(x<=0 ){
   up= true;
   sound.trigger();

 }
 if (foward){
  x+= 7;
 }
 else{
  x-= 2; 
   
 }
 if( x>=width){
   foward = false;
 }
 else if(x<=0 ){
   foward= true;
 }
 i 
 rect(mouseX, 695, 100, 5);

}
boolean intersects(int X, int Y, int mouseX, int paddleY, int paddleLength) {
     if (Y > paddleY && X > mouseX && X < mouseX + paddleLength)
          return true;
     else 
          return false;
}