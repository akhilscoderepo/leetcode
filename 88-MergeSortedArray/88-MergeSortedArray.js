// Last updated: 26/12/2025, 16:02:05
/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let i = m-1;
    let j = n-1;
    let k = m+n-1;

    while(j >=0){
        if(i>=0 && nums1[i] > nums2[j]){
            nums1[k] = nums1[i]
            i--
        }else{
             nums1[k] = nums2[j]
            j--;
        }
        k--
    }
};
//[1,2,2,3,5,6] [2,5,6]
//n1 = 2, m=4, n=0




//start from l-m-1 on nums1 call it i
//start from n-1 on nums2 call it j
//if(nums2[j] > nums1[i]) place at nums1.length-1 because sorted move j--
//if(nums2[j] < nums1[i]) the move i--
//if(equal) move j--