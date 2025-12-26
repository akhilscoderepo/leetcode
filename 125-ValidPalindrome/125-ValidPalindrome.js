// Last updated: 26/12/2025, 16:01:54
/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.toLowerCase().replace(/[^a-z0-9]/g, '');

    let start = 0;
    let end = s.length-1;

    while(end > start){
        if(s.charAt(start).toLowerCase() != s.charAt(end).toLowerCase()){
            return false
        }
        start++
        end--
    }

    return true
};