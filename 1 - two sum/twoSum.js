/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
    for (const[index, number] of nums.entries()) {
        for(const[otherIndex, otherNumber] of nums.entries()){
            if (index === otherIndex) continue;
            if (number + otherNumber === target) return [index, otherIndex];
        }
    }
};

const nums = [-1,2,3,1,2,7,20];
const target = 9;
console.log(twoSum(nums, target));