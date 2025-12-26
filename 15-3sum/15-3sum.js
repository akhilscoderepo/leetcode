// Last updated: 26/12/2025, 16:02:27
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function (nums) {
    let result = [];

    if(nums.length < 3) return result
    nums.sort((a,b) => a-b)

    for(let i = 0; i < nums.length-2; i++){
        if(nums[i] > 0) break
        if(i > 0 && nums[i] == nums[i-1]) continue

        let j = i+1;
        let k = nums.length-1;

        while(k > j){
            let sum = nums[i] + nums[j] + nums[k]
            if(sum == 0){
                result.push([nums[i], nums[j], nums[k]])
                while(nums[k] == nums[k-1]) k--
                while(nums[j] == nums[j+1]) j++
                j++
                k--
            }else if(sum > 0){
                k--
            }else{
                j++
            }
        }
    }

    return result;

};
//[-4,-1,-1,0,1,2]
//sum = -3



//sort the array
//iterate through the array starting from 0
//at index i send the next part of the array as nums and i as target
//add result to an array

