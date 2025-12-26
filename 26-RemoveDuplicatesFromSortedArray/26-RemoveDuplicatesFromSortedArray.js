// Last updated: 26/12/2025, 16:02:19
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    let i =1;

    for(let j =1; j < nums.length; j++){
        if(nums[j] !== nums[i-1]){
            nums[i] = nums[j]
            i++
        }
    }
    return i;
};