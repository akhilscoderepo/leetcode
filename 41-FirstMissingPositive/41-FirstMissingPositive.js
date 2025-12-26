// Last updated: 26/12/2025, 16:02:15
/**
 * @param {number[]} nums
 * @return {number}
 */
var firstMissingPositive = function(nums) {
   const swap = (arr, i, j) => {
    [arr[i], arr[j]] = [arr[j] , arr[i]]
   }

    const n = nums.length;

    for(let i = 0; i < n; i++){
        while(nums[i] > 0 && nums[i] <= n && nums[i] !== nums[nums[i]-1]){
            swap(nums, i, nums[i]-1)
        }
    }

    for(let j = 0; j < n; j++){
        if(nums[j] !== j+1){
            return j+1
        }
    }

    return n+1;
}
//[0,1,2]

//create map
//iterate through array and add numeber at index
//at end iterate over the array again

//image an array of size 1 million and missing number is at end we have to iterate twice 

//can we use array ? 

//{3,1},{4,1}, {-1, 1}, {1,1}