
from collections import Counter

class Hw8:
    def longestPalindrome(self, s: str) -> int:
        char_counts = Counter(s)
        length = 0
        odd_used = False
        for count in char_counts.values():
            if count % 2 == 0:
                length += count
            else:
                length += count - 1 # Add the even part
                if not odd_used:
                    length += 1 # Add one odd count as the center of palindrome
                    odd_used = True
        return length

# Example usage:
Hw8 = Hw8()
print(Hw8.longestPalindrome("abccccdd")) # Output: 7
print(Hw8.longestPalindrome("speediskey")) # Output: 5
