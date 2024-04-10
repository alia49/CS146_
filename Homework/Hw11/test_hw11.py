
import unittest
from hw11 import HW11  # Ensure this matches the name of your script containing the HW11 class

class TestHW11(unittest.TestCase):
    def test_flood_fill_case1(self):
        solution = HW11()
        image = [
            [1, 1, 1],
            [1, 1, 0],
            [1, 0, 1]
        ]
        sr, sc, newColor = 1, 1, 2
        expected_result = [
            [2, 2, 2],
            [2, 2, 0],
            [2, 0, 1]
        ]
        result = solution.floodFill(image, sr, sc, newColor)
        self.assertEqual(result, expected_result)

    def test_flood_fill_case2(self):
        solution = HW11()
        image = [
            [0, 0, 0],
            [0, 0, 0]
        ]
        sr, sc, newColor = 0, 0, 0
        expected_result = [
            [0, 0, 0],
            [0, 0, 0]
        ]
        result = solution.floodFill(image, sr, sc, newColor)
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()
