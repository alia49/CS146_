
public class hw11{
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Get the original color of the starting pixel
        int originalColor = image[sr][sc];
        
        // If the original color is the same as the new color, return the image as is
        // to avoid infinite recursion.
        if (originalColor != newColor) {
            fill(image, sr, sc, originalColor, newColor);
        }
        
        return image;
    }
    
    private void fill(int[][] image, int sr, int sc, int originalColor, int newColor) {
        // Base case: Check if the current pixel is out of bounds or is not of the original color
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != originalColor) {
            return;
        }
        
        // Change the color of the current pixel
        image[sr][sc] = newColor;
        
        // Recursively fill the surrounding pixels (up, down, left, right)
        fill(image, sr - 1, sc, originalColor, newColor); // up
        fill(image, sr + 1, sc, originalColor, newColor); // down
        fill(image, sr, sc - 1, originalColor, newColor); // left
        fill(image, sr, sc + 1, originalColor, newColor); // right
    }
    
    public static void main(String[] args) {
        hw11 solution = new hw11();
        
        // Test case 1
        int[][] image1 = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr1 = 1, sc1 = 1, newColor1 = 2;
        int[][] result1 = solution.floodFill(image1, sr1, sc1, newColor1);
        printImage(result1);
        
        // Test case 2
        int[][] image2 = {
            {0, 0, 0},
            {0, 0, 0}
        };
        int sr2 = 0, sc2 = 0, newColor2 = 0;
        int[][] result2 = solution.floodFill(image2, sr2, sc2, newColor2);
        printImage(result2);
    }
    
    // Helper method to print the image
    private static void printImage(int[][] image) {
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
