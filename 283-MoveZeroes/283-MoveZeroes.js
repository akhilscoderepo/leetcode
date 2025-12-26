// Last updated: 26/12/2025, 16:01:11
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    var slow = 0;

    for(var fast=0; fast < nums.length; fast++){
       if(nums[fast] != 0){
            var temp = nums[slow]
            nums[slow] = nums[fast];
            nums[fast] = temp;
            ++slow;
       }
    }
};

// 0.1.0.3.12
// 1.0.0.3.12
// 1.0.0.3.12
// 1.3.0.0.12
// 1.3.12.0.0
