
class HW11:
    def floodFill(self, image, sr, sc, newColor):
        # Get the original color of the starting pixel
        originalColor = image[sr][sc]

        # If the original color is the same as the new color, return the image as is
        # to avoid infinite recursion.
        if originalColor != newColor:
            self.fill(image, sr, sc, originalColor, newColor)

        return image

    def fill(self, image, sr, sc, originalColor, newColor):
        # Base case: Check if the current pixel is out of bounds or is not of the original color
        if sr < 0 or sc < 0 or sr >= len(image) or sc >= len(image[0]) or image[sr][sc] != originalColor:
            return

        # Change the color of the current pixel
        image[sr][sc] = newColor

        # Recursively fill the surrounding pixels (up, down, left, right)
        self.fill(image, sr - 1, sc, originalColor, newColor)  # up
        self.fill(image, sr + 1, sc, originalColor, newColor)  # down
        self.fill(image, sr, sc - 1, originalColor, newColor)  # left
        self.fill(image, sr, sc + 1, originalColor, newColor)  # right

# Helper function to print the image
def printImage(image):
    for row in image:
        for pixel in row:
            print(pixel, end=" ")
        print()
    print()

# Usage example
if __name__ == "__main__":
    solution = HW11()

    # Test case 1
    image1 = [
        [1, 1, 1],
        [1, 1, 0],
        [1, 0, 1]
    ]
    sr1, sc1, newColor1 = 1, 1, 2
    result1 = solution.floodFill(image1, sr1, sc1, newColor1)
    printImage(result1)

    # Test case 2
    image2 = [
        [0, 0, 0],
        [0, 0, 0]
    ]
    sr2, sc2, newColor2 = 0, 0, 0
    result2 = solution.floodFill(image2, sr2, sc2, newColor2)
    printImage(result2)
