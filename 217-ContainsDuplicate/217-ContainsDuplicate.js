// Last updated: 26/12/2025, 16:01:26
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
     const newArray = new Set();
    for (i = 0; i < nums.length; i++) {
        if (newArray.has(nums[i])) {
            return true;
        } else {
           newArray.add(nums[i])
        }
    } return false;
};