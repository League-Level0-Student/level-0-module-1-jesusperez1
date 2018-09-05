void setup() {
    size(500, 500);
}
void draw() {
    background(255);
    noStroke();
    fill(#FF0015);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#089527); 
    rect(176, 103, 12, 32);
    if (mousePressed){
    fill(#FFFFFF);
    ellipse(90,175,50,50);
    }
}