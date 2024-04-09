
class lab2:
    def isAnagram(self, s, t):
        # Convert strings to sorted lists of characters and compare
        return sorted(s) == sorted(t)

if __name__ == "__main__":
    checker = lab2()
    print(checker.isAnagram("listen", "silent"))  # True
    print(checker.isAnagram("hello", "world"))    # False
