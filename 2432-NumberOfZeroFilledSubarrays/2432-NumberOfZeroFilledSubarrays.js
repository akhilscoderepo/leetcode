// Last updated: 26/12/2025, 15:58:53
/**
 * @param {number[]} nums
 * @return {number}
 */
var zeroFilledSubarray = function(nums) {
    let current = 0;
    let result = 0;

    for(var i =0; i< nums.length; i++){
        if(nums[i]===0){
            ++current
            result +=  current 
        }else{
            current=0;
        }
    }

    return result;
};



//[0,0,0,2,0,0]
//have a result variable as 0
//multiplyerFactor = 1
//maxContinoutsZeros as another varaibale = 0
//start moving across
//if current number is zero then add maxContinoutsZeros++ * multiplyerFactor
//else set maxContinoutsZeros back to 0
//return result



