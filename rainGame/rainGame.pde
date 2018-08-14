int x = 350;
int y = 0;
int score = 0;
void setup(){
  size(700, 700);

}
void draw(){
int randomNumber = (int) random(width);
  

if(y >= 680){
   checkCatch( x);
  y=0;
  
  x = randomNumber;
 
}

  background(0, 0, 0);
  fill(0,255,0);
stroke(255,0,0);

ellipse(x, y, 10, 20);
y+=10;

rect(mouseX, 670, 40, 30);
fill(255, 255, 255);
textSize(16);
text("Score: " + score, 20, 20);



}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+40)
          score++;
     else if (score > 0) 
          score = 0;
     println("Your score is now: " + score); }