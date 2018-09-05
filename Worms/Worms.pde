float x = 0;
float y = 700;
void setup(){
  size(2000,1000);
background(105,162,50);
}
void draw(){
  makeMagical();
  fill(#4B3B02);
  for(int i=0;i<300;i++){
    ellipse (getWormX(i),getWormY(i),10,10);
  
  }
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}