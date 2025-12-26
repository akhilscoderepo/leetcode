// Last updated: 26/12/2025, 16:01:38
/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var start = 0;
    var end = nums.length-1;

    while(end > start){
        if(nums[start]+nums[end] == target){
            return [start+1, end+1];
        }else if(nums[start]+nums[end]>target){
            --end;
        }else{
            start++;
        }
    }
    return [-1, -1]
};