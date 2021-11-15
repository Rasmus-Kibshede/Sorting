public class Ball implements Comparable<Ball> {
    private int brightness;

    public Ball() {
        this((int) Math.floor(Math.random() * 16));
    }

    public Ball(int brightness) {
        this.brightness = brightness % 16;
    }

    public boolean brighterThan(Ball otherBall) {
        if (otherBall.brightness < this.brightness) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return Integer.toString(brightness);
    }

/*    @Override
    public int compareTo(Sammenlignbar other) {
        Ball ball = (Ball) other;
        return brightness < ball.brightness ? -1 : 1;
    }

    @Override
    public String toCSVString() {
        return null;
    }*/

    @Override
    public int compareTo(Ball o) {
        return Integer.compare(brightness, o.brightness);
    }
}
