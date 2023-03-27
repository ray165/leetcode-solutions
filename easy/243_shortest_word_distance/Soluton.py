# Feb 17, 2023

class Solution:
    def shortestDistance(self, wordsDict: List[str], word1: str, word2: str) -> int:
        count = len(wordsDict)
        index = 0
        pos1, pos2, = -1, -1

        for word in wordsDict:
            if word == word1:
                pos1 = index
            elif word == word2:
                pos2 = index

            if pos1 > -1 and pos2 > -1:
                count = min(count, abs(pos1 - pos2))
            index += 1

        return count