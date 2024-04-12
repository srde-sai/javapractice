package com.srdesai;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetsPractice {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Red"));
        balls.add(new Ball("White"));
        balls.add(new Ball("Pink"));
        balls.add(new Ball("White"));
        balls.forEach(System.out::println);
        System.out.println(balls.size());

    }

    static class Ball {
        String Color;

        public Ball(String color) {
            this.Color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(Color, ball.Color);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(Color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "Color='" + Color + '\'' +
                    '}';
        }
    }

}
