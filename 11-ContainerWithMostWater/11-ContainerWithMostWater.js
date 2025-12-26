// Last updated: 26/12/2025, 16:02:26
/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let maxArea = 0;
    let l = 0;
    let r = height.length-1
    
    while(l < r){
     maxArea = Math.max(maxArea, (r-l)*(Math.min(height[l], height[r])))
        if(height[l] <= height[r]){
            l++
        }else{
            r--
        }
    //console.log(r-1, Math.min(height[l], height[r]))
    }

    return maxArea;
};
[1,1]

//8,2,8,1,4
//16, 3, 24, 2, 
//start from each ends
//i=1 in loop and j outside as n.length-1
//find maxArea = Math.max(maxArea, area = j-i-1*Math.min(nums[i-1], nums[j]))
//if (i-1)

//or start with two variables i =1; j = nums.length-1