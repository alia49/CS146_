class Hw2:
    def __init__(self, first_bad_version):
        self.first_bad_version = first_bad_version
    
    def firstBadVersion(self, n):
        left = 1
        right = n
        
        while left < right:
            mid = left + (right - left) // 2
            if self.isBadVersion(mid):
                right = mid
            else:
                left = mid + 1
                
        return left

    def isBadVersion(self, version):
        return version >= self.first_bad_version

# Example usage
if __name__ == "__main__":
    solution = Hw2(4)  # Assuming version 4 is the first bad version
    print(solution.firstBadVersion(5))  # Should print 4
