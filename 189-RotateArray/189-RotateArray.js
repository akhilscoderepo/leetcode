// Last updated: 26/12/2025, 16:01:36
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    k %= nums.length;
    
    // let temp = nums.slice(-k).concat(nums.slice(0,-k))
    // //nums.splice(-k,k).concat(nums.splice(0)) 
    // for(let n =0; n < temp.length; n++){
    //     nums[n] = temp[n]
    // }

    const r = (l,r) => {
        while(l < r){
            [nums[l], nums[r]] = [nums[r], nums[l]]
            l++;
            r--;
        }
    }

    r(0, nums.length-1);
    r(k, nums.length-1)
    r(0, k-1)
};