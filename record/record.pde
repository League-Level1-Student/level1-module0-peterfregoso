
import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
PImage pictureOfRecord;  //as member variable
int imageangle = 5;
void setup(){
  minim = new Minim(this);  //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);//in the setup method

  size(250, 250);
pictureOfRecord= loadImage("record.jpg");  //in setup method  
}

void draw(){

if (mousePressed){
  song.play();
 
rotateImage(  pictureOfRecord, imageangle);
image(pictureOfRecord, 0, 0);//in draw method
imageangle += 5;
 song.pause();
 //at the very top of your sketch
  //as a member variable
 //as a member variable
  //in the setup method

}
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}