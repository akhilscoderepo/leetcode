// Last updated: 26/12/2025, 16:01:39
/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    var map = new Map();
    var target = nums.length/2;

    for(var n of nums){
        var iter = map.get(n);
        map.set(n, !iter?1:iter+1)
    }

    for(var [k,v] of map.entries()){
        if(v > target){
            return k;
        }
    }

};