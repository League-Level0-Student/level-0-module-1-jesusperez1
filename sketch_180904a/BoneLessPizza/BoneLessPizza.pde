PImage shoe;

void setup() {
    size(800, 800);
    shoe=loadImage("old-mens-shoes-475.jpg");
        background(800, 800, 800);
    noStroke();
    fill(#DEB428);
    ellipse(300 , 300 , 500, 500);
    fill(#FF0900); 
    ellipse(300 , 300 , 460 , 460 );
    fill(#F4FA4E);
    ellipse(300, 300, 420, 420);
}
void draw() {
    if (mousePressed){
      
    image(shoe, mouseX, mouseY, 145, 145);
    }
}