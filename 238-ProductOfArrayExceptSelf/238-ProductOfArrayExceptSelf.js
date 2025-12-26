// Last updated: 26/12/2025, 16:01:17
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
     const n = nums.length;

    const result = new Array(n).fill(1);

    for (let i = 1; i < n; i++) {
        result[i] = result[i - 1] * nums[i - 1];
    }

    let suff = 1;
    for (let i = n - 2; i >= 0; i--) {
        suff *= nums[i + 1];
        result[i] *= suff;
    }

    return result;

};


