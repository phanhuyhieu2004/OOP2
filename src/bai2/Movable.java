package bai2;


    interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

     class MovablePoint implements Movable {
        private int x;
        private int y;
        private int xSpeed;
        private int ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public void moveUp() {
            y -= ySpeed;
        }

        @Override
        public void moveDown() {
            y += ySpeed;
        }

        @Override
        public void moveLeft() {
            x -= xSpeed;
        }

        @Override
        public void moveRight() {
            x += xSpeed;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d) speed=(%d, %d)", x, y, xSpeed, ySpeed);
        }

    }

 class Main {
    public static void main(String[] args) {
        bai2.Movaable.MovablePoint p1 = new bai2.Movaable.MovablePoint(0, 0, 1, 1);
        System.out.println(p1.toString());
        p1.moveUp();
        System.out.println(p1.toString());
        p1.moveRight();
        System.out.println(p1.toString());
    }
}



