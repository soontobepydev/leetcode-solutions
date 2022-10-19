class Solution:
    def twoSum(self, nums, target):
        for index, num in enumerate(nums):
            for i, n in enumerate(nums):
                if index == i:
                    continue
                if num + n == target:
                    return [index, i]

nums = [3,3]
target = 6
solution = Solution()
print(solution.twoSum(nums, target))