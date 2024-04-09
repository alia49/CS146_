Function findFirstBadVersion(totalVersions):
    Set leftBoundary to 1
    Set rightBoundary to totalVersions

    While leftBoundary is less than rightBoundary:
        Set middleVersion to the average of leftBoundary and rightBoundary (avoid overflow)

        If isBadVersion(middleVersion) is true:
            If the middle version is bad, the first bad version must be to the left,
            including the middle version itself.
            Set rightBoundary to middleVersion
        Else:
            If the middle version is not bad, the first bad version must be to the right.
            Set leftBoundary to middleVersion + 1

     When the loop ends, leftBoundary and rightBoundary converge to the first bad version.
    Return leftBoundary

Function isBadVersion(version):
     This function checks if a given version is bad.
     It returns true if the version is bad, false otherwise.

     Implementation depends on the system's way of defining a bad version.
     For pseudocode, assume a way to determine if a version is bad.
