package io.github.bradleywaffles.visual_sort;

import processing.core.PApplet;

public class visual_bubble_sort extends PApplet{
    public static void main(String[] args) {
        PApplet.main(visual_bubble_sort.class.getCanonicalName());
    }
    boolean sortNow = true;
    float[] heights = new float[800];
    int times = 0;


    public void settings() {
        size(800,800);
//        create();
    }

    public void draw() {
        background(0);
        if (sortNow) {
            for (int i = 0; i < heights.length; i++) {
                heights[i] = random(5, 795);
            }
            sortNow = false;
        }
        sort();
    }

    boolean swapMade = false;

    public void sort() {
        swapMade = false;
        for (int i=0; i < heights.length - 1; i++) {
            if (heights[i] < heights[i+1]) {
                swapMade = true;
                float holder = heights[i];
                heights[i] = heights[i+1];
                heights[i+1] = holder;
            }
//            stroke(0,255,255);
//            stroke(map(heights[i], 5, 795, 0, 255), map(heights[i], 5, 795, 0, 255), 255 - map(heights[i], 5, 795, 0, 255));
            stroke(255,0,0);
            line(i, heights.length, i, heights[i]);
        }
        if (!swapMade) {
            sortNow = true;
        }
    }
}
