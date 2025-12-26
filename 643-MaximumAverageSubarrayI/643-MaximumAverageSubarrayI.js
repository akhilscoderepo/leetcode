// Last updated: 26/12/2025, 16:00:38
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function (nums, k) {
    
    let sum =0;

    for(let i =0;i<k;i++){
        sum+=nums[i];
    }

    let max = sum ;

    for(let i = k;i<nums.length;i++){

        sum = sum - nums[i-k] + nums[i];
        if(max<sum){
            max=sum
        }
    }
    return max/k;
};
//I have keep this pattern before
//find avg of first k elements
//start at i=1 till length-2, j=k-1+i
//math.max(avg, previousAvg)
//sum for avg += (j+1 number if exists)-(i-1)
