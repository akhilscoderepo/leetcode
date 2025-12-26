// Last updated: 26/12/2025, 16:01:23
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {
   let map = new Map();

   for(let i = 0; i < nums.length; i++){
    if(i - map.get(nums[i]) <= k) return true;
    map.set(nums[i], i)
   }

    return false
};

//[2,2] k =3