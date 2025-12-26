// Last updated: 26/12/2025, 16:01:06
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var increasingTriplet = function(nums) {
    let min = Infinity, max = Infinity;

    for(let n of nums){
        if(n <= min){
            min = n
        }else if(n <= max){
            max = n
        }else {
            return true
        }
    }
    return false
};


