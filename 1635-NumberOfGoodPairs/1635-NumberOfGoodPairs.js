// Last updated: 26/12/2025, 15:59:27
/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    let map = new Map();
    let result = 0;

    for(let n of nums){
        map.set(n, (map.get(n) || 0)+1)
    }
    

    for(let [k,v] of map.entries()){
        if(v > 1){
            result += maxPossbilities(v);
        }
        
    }

    return result;
};

var maxPossbilities = function(nums){
    return (nums*(nums-1))/2
}
