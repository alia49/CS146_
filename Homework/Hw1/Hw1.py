class PalindromeChecker:
    
    @staticmethod
    def is_palindrome_built_in(s: str) -> bool:
        normalized = ''.join(char.lower() for char in s if char.isalnum())
        return normalized == normalized[::-1]
    
    @staticmethod
    def is_palindrome_two_pointers(s: str) -> bool:
        left, right = 0, len(s) - 1
        
        while left < right:
            if not s[left].isalnum():
                left += 1
                continue
            if not s[right].isalnum():
                right -= 1
                continue
            if s[left].lower() != s[right].lower():
                return False
            left += 1
            right -= 1
        
        return True

def test_palindrome_checker():
    test_cases = [
        ("A man, a plan, a canal: Panama", True),
        ("race a car", False),
        (" ", True),
        ("a.", True),
        ("0P", False),
        ("A Toyota's a Toyota", True),
        ("Not a Palindrome", False),
        ("Madam, I'm Adam", True)
    ]
    
    for idx, (test, expected) in enumerate(test_cases, 1):
        result_builtin = PalindromeChecker.is_palindrome_built_in(test)
        result_two_pointers = PalindromeChecker.is_palindrome_two_pointers(test)
        
        print(f"Test Case {idx}: '{test}'")
        print(f"Expected: {expected}, Built-in Method: {result_builtin}, Two Pointers Method: {result_two_pointers}")
        
        assert result_builtin == expected, f"Built-in Method failed on test case {idx}"
        assert result_two_pointers == expected, f"Two Pointers Method failed on test case {idx}"
        print("Passed\n")

# Run the test function
if __name__ == "__main__":
    test_palindrome_checker()
