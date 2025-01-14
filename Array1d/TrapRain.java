package Array1d;

public class TrapRain {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int leftmax[] = new int[7];
        int rightmax[] = new int[height.length];

        // calculate left max heights
        leftmax[0]= height[0];
        for(int i=1; i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // calculate right max heights
        rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        // calculate water trapped
        int trapped = 0;
        for(int i=0; i<height.length; i++){
            trapped += Math.min(leftmax[i], rightmax[i])-height[i];
        }

        System.out.println(trapped);
    }
}